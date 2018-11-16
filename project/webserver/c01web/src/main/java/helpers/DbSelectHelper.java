package helpers;

import java.util.ArrayList;
import java.util.List;

import queryhelper.QueryParameter;
import queryhelper.QueryParameterValue;

public class DbSelectHelper
{
	private String tableName;
	
	private List<QueryParameter> resultFields;
	private List<QueryParameterValue> conditionFields;
	
	public DbSelectHelper(String tableName)
	{
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
