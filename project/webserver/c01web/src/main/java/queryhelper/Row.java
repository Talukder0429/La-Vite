package queryhelper;

import java.util.ArrayList;
import java.util.List;

public class Row
{
	private List<QueryParameterValue> fields;

	public Row()
	{
		this.fields = new ArrayList<QueryParameterValue>();
	}
	
	public void addField(String field, String value)
	{
		QueryParameterValue qbv = new QueryParameterValue(field, value);
		this.fields.add(qbv);
	}
	
	@Override
	public String toString()
	{
		String result = "";
		
		result += "{";
		for (int a = 0; a < this.fields.size(); a++)
		{
			QueryParameterValue qbv = this.fields.get(a);
			result += qbv.toString();
			
			if (a != this.fields.size() - 1)
			{
				result += ",";
			}
		}
		result += "}";
		
		return result;
	}
}
