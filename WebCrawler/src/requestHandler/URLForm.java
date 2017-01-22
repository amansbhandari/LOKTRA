package requestHandler;

import WebCrawler.Constants;
import WebCrawler.QueryParams;

/*
 * to form URl based on query param
 */
public class URLForm 
{
	
	public String form(String url , QueryParams param)
	{
		if(param.getPage() != null)
		{
			url += Constants.PQ + param.getPage();
		}
		if(param.getKey() != null)
		{
			url += Constants.KW + param.getKey();
		}
		
		return url;
	}
}
