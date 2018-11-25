package helpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import queryhelper.QueryParameter;
import queryhelper.QueryParameterValue;

public class DbUpdateHelper
{
	private Connection connection;
	private String tableName;
	
	private List<QueryParameterValue> updateFields;
	private List<QueryParameterValue> conditionFields;
	
	public DbUpdateHelper(Connection connection, String tableName)
	{
		this.connection = connection;
		this.tableName = tableName;
		
		this.updateFields = new ArrayList<QueryParameterValue>();
		this.conditionFields = new ArrayList<QueryParameterValue>();
	}
	
	public void addUpdateField(String field, String value)
	{
		QueryParameterValue qbv = new QueryParameterValue(field, value);
		this.updateFields.add(qbv);
	}
	
	public void addConditionField(String field, String value)
	{
		QueryParameterValue qbv = new QueryParameterValue(field, value);
		this.conditionFields.add(qbv);
	}
	
	public String buildQueryString()
	{
		String result = "";
		
		result += "UPDATE ";
		result += this.tableName;
		result += " SET ";
		result += this.buildUpdateFields();
		result += this.buildConditionFieldsString();
		
		System.out.println(result);
		return result;
	}
	
	public void doUpdate() throws SQLException
	{
		PreparedStatement ps = this.connection.prepareStatement(this.buildQueryString());
		//done like this since there is an order to the ps
		int index = 1;
		for (int a = 0; a < this.updateFields.size(); a++)
		{
			QueryParameterValue qbv = this.updateFields.get(a);
			if (this.fieldInList(qbv, this.conditionFields))
			{
				continue;
			}
			
			ps.setString(index, qbv.getValue());
			index++;
		}
		for (int a = 0; a < this.conditionFields.size(); a++)
		{
			QueryParameterValue qbv = this.conditionFields.get(a);
			ps.setString(index, qbv.getValue());
			index++;
		}
		
		ps.executeUpdate();
	}
	
	private String buildUpdateFields()
	{
		String result = "";
		
		for (int a = 0; a < this.updateFields.size(); a++)
		{
			QueryParameterValue qbv = this.updateFields.get(a);
			if (this.fieldInList(qbv, this.conditionFields)) //if update field is a condition field, then skip it, no changing condition fields
															//this is useful for us since it will prevent updating things like dates and identifiers
			{
				continue;
			}
			
			result += qbv.getName();
			result += "=";
			result += "?";
			
			if (a != this.updateFields.size() - 1)
			{
				result += ", ";
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
				result += qbv.getName() + "=" + "?"; //yes this is basically a copy from select helper, but there i forgot to use preparedstatement
				
				if (a != this.conditionFields.size() - 1)
				{
					result += "AND ";
				}
			}
		}
		
		return result;
	}
	
	//cant just find index of qb in list, since references are different
	private boolean fieldInList(QueryParameter param, List<QueryParameterValue> list) //list should ideally be QueryParameter
	{
		for (QueryParameter qb : list)
		{
			if (qb.getName() == param.getName())
			{
				return true;
			}
		}
		return false;
	}
}
