package helpers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import queryhelper.QueryParameter;
import queryhelper.QueryParameterValue;
import queryhelper.Row;

public class DbSelectHelper
{
	private Connection connection;
	private String tableName;
	
	private List<QueryParameter> returnFields;
	private List<QueryParameterValue> conditionFields;
	private List<Row> resultFields;
	private boolean isDistinct;
	
	public DbSelectHelper(Connection connection, String tableName)
	{
		this.connection = connection;
		this.tableName = tableName;
		
		this.returnFields = new ArrayList<QueryParameter>();
		this.conditionFields = new ArrayList<QueryParameterValue>();
		
		this.setDistinct(false);
	}
	
	public void addResultField(String field)
	{
		QueryParameter qb = new QueryParameter(field);
		this.returnFields.add(qb);
	}
	
	public void addConditionField(String field, String value)
	{
		QueryParameterValue qbv = new QueryParameterValue(field, value);
		this.conditionFields.add(qbv);
	}
	
	public void setDistinct(boolean distinct)
	{
		this.isDistinct = distinct;
	}
	
	public void retrieveRows() throws SQLException
	{
		String query = this.buildQueryString();
		
		Statement statement = this.connection.createStatement();
		ResultSet results = statement.executeQuery(query);
		ResultSetMetaData meta = results.getMetaData();
		
		this.resultFields = new ArrayList<Row>();
		while (results.next())
		{
			Row row = new Row();
			for (int a = 1; a <= meta.getColumnCount(); a++)
			{
				String name = meta.getColumnName(a);
				String value = results.getString(a);
				row.setField(name, value);
			}
			this.resultFields.add(row);
		}
		
		results.close();
		statement.close();
	}
	
	public String buildQueryString()
	{
		String result = "";
		
		result += "SELECT ";
		result += this.buildDistinctString();
		result += this.buildResultFieldsString();
		result += " FROM ";
		result += this.tableName + " ";
		result += this.buildConditionFieldsString();
		result += ";";
		
		System.out.println(result);
		return result;
	}
	
	private String buildDistinctString()
	{
		if (this.isDistinct)
		{
			return "DISTINCT ";
		}
		return "";
	}
	
	private String buildResultFieldsString()
	{
		String result = "";
		
		if (this.returnFields.size() == 0)
		{
			result += "*";
		}
		else
		{
			for (int a = 0; a < this.returnFields.size(); a++)
			{
				QueryParameter qb = this.returnFields.get(a);
				result += qb.getName();
				
				if (a != this.returnFields.size() - 1)
				{
					result += ", ";
				}
			}
		}
		
		return result;
	}
	
	private String buildConditionFieldsString()
	{
		String result = "";
		
		if (this.conditionFields.size() > 0)
		{
			result += "WHERE ";
			for (int a = 0; a < this.conditionFields.size(); a++)
			{
				QueryParameterValue qbv = this.conditionFields.get(a);
				result += qbv.getName() + "=" + "\"" + qbv.getValue() + "\"" + " ";
				
				if (a != this.conditionFields.size() - 1)
				{
					result += "AND ";
				}
			}
		}
		
		return result;
	}
	
	public List<Row> getRows()
	{
		return this.resultFields;
	}
}
