package servlets;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queryhelper.Field;
import queryhelper.HttpServletRequestHelper;
import queryhelper.QueryBuilder;

import java.sql.*;
import java.util.Scanner;

import java.net.URLDecoder;

/**
 * Servlet implementation class ClientProfileServlet
 */
@WebServlet("/ClientProfile")
public class ClientProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String dbname;
	private String dbuser;
	private String dbpass;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClientProfileServlet() {
		super();
		try
		{
			String s = getClass().getName();
			int i = s.lastIndexOf(".");
			if(i > -1) s = s.substring(i + 1);
			s = s + ".class";
			System.out.println("name " +s);
			String testPath = this.getClass().getResource(s).toString();
			System.out.println(testPath);
			String realpath = URLDecoder.decode(testPath.substring(6), "UTF-8");
			System.out.println(realpath);
			
			Path p = Paths.get(realpath);
			Path folder = p.getParent();
			System.out.println(folder.toString());
			File config = new File(folder.toString() + "\\" + "dbconfig.txt");

			Scanner sc = new Scanner(config);
			dbname = sc.nextLine();
			dbuser = sc.nextLine();
			dbpass = sc.nextLine();
			sc.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/" + dbname + "?useSSL=false&allowPublicKeyRetrieval=true", dbuser,
						dbpass);
				)
		{
			QueryBuilder qb = new QueryBuilder(Field.TABLE_CLIENT_PROFILE);
			HttpServletRequestHelper helper = new HttpServletRequestHelper(request, qb);
			
			//for each new field, must insert it into the query builder
			helper.addToQuery(Field.UNIQUE_IDENTIFIER);
			helper.addToQuery(Field.UNIQUE_IDENTIFIER_VALUE);
			helper.addToQuery(Field.DATE_OF_BIRTH);
			helper.addToQuery(Field.PHONE_NUMBER);
			helper.addToQuery(Field.HAS_EMAIL_ADDRESS);
			helper.addToQuery(Field.EMAIL_ADDRESS);
			helper.addToQuery(Field.STREET_NUMBER);
			helper.addToQuery(Field.STREET_NAME);
			helper.addToQuery(Field.STREET_TYPE);
			helper.addToQuery(Field.STREET_DIRECTION);
			helper.addToQuery(Field.UNIT);
			helper.addToQuery(Field.CITY);
			helper.addToQuery(Field.PROVINCE);
			helper.addToQuery(Field.POSTAL_CODE);
			helper.addToQuery(Field.LANGUAGE);
			helper.addToQuery(Field.HAS_CONSENT);

			//Sets values into query
			PreparedStatement ps = conn.prepareStatement(qb.generateQueryString());
			qb.fillPreparedStatement(ps);
			ps.executeUpdate();

			response.setStatus(HttpServletResponse.SC_OK);
		} catch (SQLException e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_CONFLICT);
			response.getOutputStream().println(e.getMessage());
		}
	}
}
