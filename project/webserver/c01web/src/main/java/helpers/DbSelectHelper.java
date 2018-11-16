package helpers;

import java.util.ArrayList;
import java.util.List;

import queryhelper.QueryParameter;

public class DbSelectHelper
{
	private String tableName;
	
	private List<QueryParameter> resultFields;
	private List<QueryParameter> conditionFields;
	
	public DbSelectHelper(String tableName)
	{
		this.tableName = tableName;
		
		this.resultFields = new ArrayList<QueryParameter>();
		this.conditionFields = new ArrayList<QueryParameter>();
	}
	
	public void addResultField(String field)
	{
		QueryParameter qb = new QueryParameter(field);
	}
}
