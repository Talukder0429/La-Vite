package helpers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import queryhelper.QueryParameter;
import queryhelper.QueryParameterValue;

public class DbSelectHelper
{
	private Connection connection;
	private String tableName;
	
	private List<QueryParameter> resultFields;
	private List<QueryParameterValue> conditionFields;
	
	public DbSelectHelper(Connection connection, String tableName)
	{
		this.connection = connection;
		this.tableName = tableName;
		
		this.resultFields = new ArrayList<QueryParameter>();
		this.conditionFields = new ArrayList<QueryParameterValue>();
	}
	
	public void addResultField(String field)
	{
		QueryParameter qb = new QueryParameter(field);
		this.resultFields.add(qb);
	}
	
	public void addConditionField(String field, String value)
	{
		QueryParameterValue qbv = new QueryParameterValue(field, value);
		this.conditionFields.add(qbv);
	}
	
	public void getRows() throws SQLException
	{
		String query = this.buildQueryString();
		
		Statement statement = this.connection.createStatement();
		ResultSet results = statement.executeQuery(query);
		
		
		
		results.close();
		statement.close();
	}
	
	private String buildQueryString()
	{
		String result = "";
		
		result += "SELECT ";
		result += this.buildResultFieldsString();
		result += " FROM ";
		result += this.tableName + " ";
		result += this.buildConditionFieldsString();
		result += ";";
		
		System.out.println(result);
		return result;
	}
	
	private String buildResultFieldsString()
	{
		String result = "";
		
		if (this.resultFields.size() == 0)
		{
			result += "*";
		}
		
		return result;
	}
	
	private String buildConditionFieldsString()
	{
		String result = "";
		
		if (this.conditionFields.size() > 0)
		{
		}
		
		return result;
	}
}
