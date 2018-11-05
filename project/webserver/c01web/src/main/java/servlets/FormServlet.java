package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.DbConnectionHelper;
import helpers.HttpServletRequestHelper;
import queryhelper.QueryBuilder;

public abstract class FormServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	private DbConnectionHelper dbHelper;
	
	private List<String> fields;
	private String tableName;

	public FormServlet()
	{
		super();
		
		this.clearFields();
		
		try
		{
			dbHelper = new DbConnectionHelper();
			dbHelper.findDatabaseInfo();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try (
				Connection conn = this.dbHelper.connect();
			)
		{
			HttpServletRequestHelper helper = new HttpServletRequestHelper(request);
			QueryBuilder qb = new QueryBuilder(this.tableName);
			qb.setRequestHelper(helper);
			
			//this adds all of the fields and their values to the query
			for (String field : this.fields)
			{
				qb.addParamFromRequest(field);
			}

			//Sets values into query
			String queryString = qb.generateQueryString();
			PreparedStatement ps = conn.prepareStatement(queryString);
			System.out.println(queryString);
			qb.fillPreparedStatement(ps);
			ps.executeUpdate();

			response.setStatus(HttpServletResponse.SC_OK);
		} catch (SQLException e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_CONFLICT);
			response.getOutputStream().println(e.getMessage());
		}
	}
	
	protected void clearFields()
	{
		this.fields = new ArrayList<String>();
	}
	
	protected void addField(String field)
	{
		this.fields.add(field);
	}
	
	protected void setTableName(String tableName)
	{
		this.tableName = tableName;
	}
}
