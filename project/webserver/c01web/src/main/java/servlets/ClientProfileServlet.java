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

import helpers.HttpServletRequestHelper;
import queryhelper.Field;
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
			HttpServletRequestHelper helper = new HttpServletRequestHelper(request);
			QueryBuilder qb = new QueryBuilder(Field.TABLE_CLIENT_PROFILE);
			qb.setRequestHelper(helper);
			
			//for each new field, must insert it into the query builder
			qb.addParamFromRequest(Field.UNIQUE_IDENTIFIER);
			qb.addParamFromRequest(Field.UNIQUE_IDENTIFIER_VALUE);
			qb.addParamFromRequest(Field.DATE_OF_BIRTH);
			qb.addParamFromRequest(Field.PHONE_NUMBER);
			qb.addParamFromRequest(Field.HAS_EMAIL_ADDRESS);
			qb.addParamFromRequest(Field.EMAIL_ADDRESS);
			qb.addParamFromRequest(Field.STREET_NUMBER);
			qb.addParamFromRequest(Field.STREET_NAME);
			qb.addParamFromRequest(Field.STREET_TYPE);
			qb.addParamFromRequest(Field.STREET_DIRECTION);
			qb.addParamFromRequest(Field.UNIT);
			qb.addParamFromRequest(Field.CITY);
			qb.addParamFromRequest(Field.PROVINCE);
			qb.addParamFromRequest(Field.POSTAL_CODE);
			qb.addParamFromRequest(Field.LANGUAGE);
			qb.addParamFromRequest(Field.HAS_CONSENT);

			//Sets values into query
			String queryString = qb.generateQueryString();
			PreparedStatement ps = conn.prepareStatement(queryString);
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
