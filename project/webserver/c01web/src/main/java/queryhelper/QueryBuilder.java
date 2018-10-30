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
	
	
	
	public void addParam(String name, String value)
	{
		QueryParameter qp = new QueryParameter(name, value);
		this.paramsList.add(qp);
	}
	
	public String generateQueryString()
	{
		String result = "INSERT INTO ";
		result += this.tableName;
		result += this.generateParamsList();
		result += " ";
		result += this.generateQuestionMarks();
		
		return result;
	}
	
	private String generateParamsList()
	{
		String result = "(";
		
		for (int a = 0; a < this.paramsList.size(); a++)
		{
			QueryParameter qp = this.paramsList.get(a);
			String add = qp.getName();
			
			if (a != this.paramsList.size() - 1) //not last field
			{
				add += ", ";
			}
			
			result += add;
		}
		
		result += ")";
		
		return result;
	}
	
	private String generateQuestionMarks() //returns question marks for the prepared statement object
	{
		String result = "(";
		
		for (int a = 0; a < this.paramsList.size(); a++)
		{
			String add = "?";
			
			if (a != this.paramsList.size() - 1) //not last field
			{
				add += ",";
			}
			
			result += add;
		}
		
		result += ")";
		
		return result;
	}
}
