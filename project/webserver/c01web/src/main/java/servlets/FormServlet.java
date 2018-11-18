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

import helpers.DbConflictResolver;
import helpers.DbConnectionHelper;
import helpers.HttpServletRequestHelper;
import queryhelper.QueryBuilder;
import queryhelper.Row;

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
			//TODO fix insert helper to use Row
			HttpServletRequestHelper helper = new HttpServletRequestHelper(request);
			
			//This portion makes sure that the information about to be added is valid
			DbConflictResolver dbcr = new DbConflictResolver(conn, this.tableName);
			Row row = new Row();
			for (String field : this.fields)
			{
				row.addField(field, helper.getParam(field));
			}
			if (dbcr.checkIdentifierAlreadyExist(row)) //best to have this throw exception but oh well
			{
				response.setStatus(HttpServletResponse.SC_CONFLICT);
				response.getOutputStream().println("User already exists in form");
				return; //instead of stopping should instead merge
			}
			
			
			
			
			
			
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
		this.dbHelper.close();
	}
	
	protected DbConnectionHelper getDbConnectionHelper()
	{
		return this.dbHelper;
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
