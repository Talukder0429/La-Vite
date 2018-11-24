package queryhelper;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Row
{
	//private List<QueryParameterValue> fields;
	private Map<String, QueryParameterValue> fields;

	public Row()
	{
		this.fields = new HashMap<String, QueryParameterValue>();
	}
	
	public void addField(String field, String value)
	{
		QueryParameterValue qbv = new QueryParameterValue(field, value);
		//this.fields.add(qbv);
		this.fields.put(field, qbv);
	}
	
	//This returns null if the field is not found
	public String getValue(String field)
	{
		String result = null;
		
		/*for (QueryParameterValue qpv : this.fields)
		{
			if (qpv.getName().equals(field))
			{
				result = qpv.getValue();
				break;
			}
		}*/
		if(this.fields.containsKey(field))
		{
			result = this.fields.get(field).getValue();
		}
		
		return result;
	}
	
	//Will merge this row and the one supplied, row overwrites any values in this, if the value exists in row
	public void merge(Row row)
	{
		
	}
	
	@Override
	public String toString()
	{
		String result = "";
		
		result += "{";
		//for (int a = 0; a < this.fields.size(); a++)
		for (String field : this.fields.keySet())
		{
			QueryParameterValue qbv = this.fields.get(field);
			result += qbv.toString() + ",";
			
			/*if (a != this.fields.size() - 1)
			{
				result += ",";
			}*/
		}
		result = result.substring(0, result.length() - 1);
		result += "}";
		
		return result;
	}
}
