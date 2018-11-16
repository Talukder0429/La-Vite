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
}
