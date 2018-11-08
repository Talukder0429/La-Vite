package helpers;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestHelper
{
	private HttpServletRequest request;
	
	public HttpServletRequestHelper(HttpServletRequest request)
	{
		this.request = request;
	}
	
	public String getParam(String name)
	{
		return this.request.getParameter(name);
	}
}
