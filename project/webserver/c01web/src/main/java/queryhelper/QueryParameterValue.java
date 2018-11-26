package queryhelper;

public class QueryParameterValue extends QueryParameter
{
	private String value;
	
	public QueryParameterValue(String name, String value)
	{
		super(name);
		this.value = value;
	}
	
	public String getValue()
	{
		return this.value;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}
	
	@Override
	public String toString()
	{
		return this.getName() + ":" + this.getValue();
	}
}
