package queryhelper;

public class QueryParameter
{
	private String name;
	private String value;
	
	public QueryParameter(String name, String value)
	{
		this.name = name;
		this.value = value;
	}
	
	
	
	public String getName()
	{
		return this.name;
	}
	
	public String getValue()
	{
		return this.value;
	}
	
	
	
	//each new type has to have some method implemented here for it
	public boolean isString()
	{
		return (Field.isType(this.name, Field.FIELDTYPE_STRING));
	}
	
	public boolean isBoolean()
	{
		return (Field.isType(this.name, Field.FIELDTYPE_BOOLEAN));
	}
}
