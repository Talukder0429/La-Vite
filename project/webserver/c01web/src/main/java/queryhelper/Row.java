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
	
	public Map<String, QueryParameterValue> getFields()
	{
		return this.fields;
	}
	
	public void setField(String field, String value)
	{
		QueryParameterValue orig = this.fields.get(field);
		if (orig == null)
		{
			QueryParameterValue qbv = new QueryParameterValue(field, value);
			this.fields.put(field, qbv);
		}
		else
		{
			orig.setValue(value);
		}
		//this.fields.add(qbv);
		//this.fields.put(field, qbv);
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
		Map<String, QueryParameterValue> newFields = row.getFields();
		for (String field : newFields.keySet())
		{
			QueryParameterValue qbv = newFields.get(field);
			if (qbv.getValue() != "") //if the field from new row has some value, then want to overwrite
			{
				this.setField(field, qbv.getValue());
			}
		}
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
