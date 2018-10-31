package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.DbConnectionHelper;
import helpers.HttpServletRequestHelper;
import queryhelper.Field;
import queryhelper.QueryBuilder;

public abstract class FormServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	private DbConnectionHelper dbHelper;

	public FormServlet()
	{
		super();
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String tableName) throws ServletException, IOException
	{
		try (
				Connection conn = this.dbHelper.connect();
			)
		{
			HttpServletRequestHelper helper = new HttpServletRequestHelper(request);
			QueryBuilder qb = new QueryBuilder(tableName);
			qb.setRequestHelper(helper);
			
			// TODO
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////        NEW FIELDS GO HERE                                         /////////
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
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
			qb.addParamFromRequest(Field.OFFICIAL_LANGUAGE_OF_PREFERENCE);
			qb.addParamFromRequest(Field.HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION);

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
