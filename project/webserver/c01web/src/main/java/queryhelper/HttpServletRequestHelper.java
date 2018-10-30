package queryhelper;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestHelper
{
	private HttpServletRequest request;
	private QueryBuilder queryBuilder;
	
	public HttpServletRequestHelper(HttpServletRequest request, QueryBuilder queryBuilder)
	{
		this.request = request;
		this.queryBuilder = queryBuilder;
	}
	
	public String getParam(String name)
	{
		return this.request.getParameter(name);
	}
	
	public void addToQuery(String name)
	{
		this.queryBuilder.addParam(name, this.getParam(name));
	}
}
