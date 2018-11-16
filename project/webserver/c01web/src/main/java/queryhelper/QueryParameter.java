package queryhelper;

public class QueryParameter
{
	protected String name;
	
	public QueryParameter(String name) //not sure if this is smart
	{
		this.name = name;
	}
	
	
	
	public String getName()
	{
		return this.name;
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
