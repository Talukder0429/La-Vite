package helpers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import queryhelper.QueryBuilder;

@WebServlet("/FileUploadHandler")
public class FileUploadHandler extends HttpServlet {
	private static final long serialVersionUID = 1;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String file_name = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
		if (!isMultipartContent) {
			return;
		}
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			DbConnectionHelper dbHelper = new DbConnectionHelper();
			dbHelper.findDatabaseInfo();
			Connection conn = dbHelper.connect();

			List<FileItem> fields = upload.parseRequest(request);
			
			String tableName = getTableName(fields);
			System.out.println("Table: " + tableName);
			
			Iterator<FileItem> it = fields.iterator();
			if (!it.hasNext()) {
				return;
			}
			else {
				FileItem fileItem = it.next();
				// fileItem.getString() returns file content
				
				HttpServletRequestHelper helper = new HttpServletRequestHelper(request);
				QueryBuilder qb = new QueryBuilder(tableName);
				qb.setRequestHelper(helper);

				String[] allLines = fileItem.getString().split("[\\r\\n]+");
				for (String row : allLines) {
					for (String element : row.split(",\\s*")) {
						System.out.println(element);
						//
						//Not sure how to add data into respective fields. How would i retrieve field names?
						//
						qb.addParam("WHAT TO ADD HERE?", element);
					}
				}
				String query = qb.generateQueryString();
				System.out.println(query);
				
				PreparedStatement ps = conn.prepareStatement(query);
				qb.fillPreparedStatement(ps);
				ps.executeUpdate();
				response.setStatus(HttpServletResponse.SC_OK);
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.println("<script type='text/javascript'>");
			out.println("window.location.href='import.jsp?filename=" + file_name + "'");
			out.println("</script>");
			out.close();
		}
	}

	private String getTableName(List<FileItem> fields) {
		Iterator<FileItem> it = fields.iterator();
		String ret = null;
		while (it.hasNext()) {
			ret = it.next().getString();
		}
		return ret;
	}
}
