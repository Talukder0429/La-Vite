package queryhelper;

import java.util.ArrayList;
import java.util.List;

public class QueryBuilder
{
	private List<QueryParameter> paramsList;
	
	private String tableName;
	
	
	
	public QueryBuilder(String tableName)
	{
		this.paramsList = new ArrayList<QueryParameter>();
		
		this.tableName = tableName;
	}
	
	
	
	public void AddParam(String name, String value)
	{
		QueryParameter qp = new QueryParameter(name, value);
		this.paramsList.add(qp);
	}
}
