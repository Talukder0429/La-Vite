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

import queryhelper.FieldSpec;
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
			QueryBuilder qb = new QueryBuilder(FieldSpec.TABLE_CLIENT_PROFILE);
			HttpServletRequestHelper helper = new HttpServletRequestHelper(request, qb);
			
			//for each new field, must insert it into the query builder
			helper.addToQuery(FieldSpec.UNIQUE_IDENTIFIER);
			helper.addToQuery(FieldSpec.UNIQUE_IDENTIFIER_VALUE);
			helper.addToQuery(FieldSpec.DATE_OF_BIRTH);
			helper.addToQuery(FieldSpec.PHONE_NUMBER);
			helper.addToQuery(FieldSpec.HAS_EMAIL_ADDRESS);
			helper.addToQuery(FieldSpec.EMAIL_ADDRESS);
			helper.addToQuery(FieldSpec.STREET_NUMBER);
			helper.addToQuery(FieldSpec.STREET_NAME);
			helper.addToQuery(FieldSpec.STREET_TYPE);
			helper.addToQuery(FieldSpec.STREET_DIRECTION);
			helper.addToQuery(FieldSpec.UNIT);
			helper.addToQuery(FieldSpec.CITY);
			helper.addToQuery(FieldSpec.PROVINCE);
			helper.addToQuery(FieldSpec.POSTAL_CODE);
			helper.addToQuery(FieldSpec.LANGUAGE);
			helper.addToQuery(FieldSpec.HAS_CONSENT);

			//Sets values into query
			PreparedStatement ps = conn.prepareStatement(qb.generateQueryString());
			System.out.println(qb.generateQueryString());
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
