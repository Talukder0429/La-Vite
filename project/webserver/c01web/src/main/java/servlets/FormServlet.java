package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.DbConflictResolver;
import helpers.DbConnectionHelper;
import helpers.DbUpdateHelper;
import helpers.HttpServletRequestHelper;
import queryhelper.Field;
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
				row.setField(field, helper.getParam(field));
			}
			Row conflict1 = dbcr.checkIdentifierAlreadyExist(row);
			Row conflict2 = dbcr.checkUserMonthAlreadyExist(row);
			if (conflict1 != null) //best to have this throw exception but oh well
			{
				mergeDbRow(conflict1, row, conn, this.tableName);
				response.setStatus(HttpServletResponse.SC_OK);
				response.getOutputStream().println("Row was merged with existing row");
				return; //instead of stopping should instead merge
			}
			if (conflict2 != null)
			{
				mergeDbRow(conflict2, row, conn, this.tableName);
				response.setStatus(HttpServletResponse.SC_OK);
				response.getOutputStream().println("Row was merged with existing row");
				return; //instead of stopping should instead merge
			}
			
			
			//this part is all insertion
		
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
			qb.fillPreparedStatement(ps);
			ps.executeUpdate();

			response.setStatus(HttpServletResponse.SC_OK);
			response.getOutputStream().println("Successfully inserted row");
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_CONFLICT);
			response.getOutputStream().println(e.getMessage());
		}
		this.dbHelper.close();
	}
	
	//static because reasons
	public static void mergeDbRow(Row originalRow, Row newRow, Connection conn, String tableName) throws SQLException
	{
		//yes this is horrible, but need to prevent dates from being overwritten
		if (DbConflictResolver.MONTH_TABLES.contains(tableName))
		{
			String dateField = DbConflictResolver.DATE_MAPS.get(tableName);
			newRow.setField(dateField, "");
		}
		
		originalRow.merge(newRow);
		DbUpdateHelper dbuh = new DbUpdateHelper(conn, tableName);
		for (String field : originalRow.getFields().keySet())
		{
			String value = originalRow.getValue(field);
			dbuh.addUpdateField(field, value);
		}
		dbuh.addConditionField(Field.UNIQUE_IDENTIFIER, originalRow.getValue(Field.UNIQUE_IDENTIFIER));
		dbuh.addConditionField(Field.UNIQUE_IDENTIFIER_VALUE, originalRow.getValue(Field.UNIQUE_IDENTIFIER_VALUE));
		if (DbConflictResolver.MONTH_TABLES.contains(tableName)) //is a form which uses dates
		{
			String dateField = DbConflictResolver.DATE_MAPS.get(tableName);
			dbuh.addConditionField(dateField, originalRow.getValue(dateField));
		}
		
		dbuh.doUpdate();
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
