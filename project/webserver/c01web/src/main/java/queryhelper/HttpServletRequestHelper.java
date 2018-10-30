package queryhelper;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestHelper
{
	private HttpServletRequest request;
	
	public HttpServletRequestHelper(HttpServletRequest request)
	{
		this.request = request;
	}
	
	public String GetParam(String name)
	{
		return this.request.getParameter(name);
	}
}
