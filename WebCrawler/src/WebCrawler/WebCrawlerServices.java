package WebCrawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrawlerServices 
{
		
	/*
	 * Directs to API according to the params present
	 * In future if more params are added, this api allows modification
	 */
	public int direct(QueryParams params, String responseHTML) throws IOException
	{
		if(params.getPage() != null)
		{
			return numberOfResultsPageWise(params.getPage() , params.getKey() , responseHTML);
		}
		else
		{
			return numberOfResults(params.getKey() , responseHTML);
		}
			
	}
	/*
	 * Considering 
	 */
	public int numberOfResults(String key , String responseHTML) throws IOException
	{
		//NULL CHECK
		if(responseHTML.isEmpty())
			 	return 0;
		
		int index = responseHTML.lastIndexOf("<span class=\"numTotalResults\">") + 28;
		
		//If 0 results come
		if(index == -1)
				return 0;
		
		String numTotalResults = responseHTML.substring(index, index + 40);
		
		String result = numTotalResults.substring(numTotalResults.lastIndexOf("of ")+3,numTotalResults.lastIndexOf("</span>"));
		
		int index_Amp = result.lastIndexOf('&');
		if(index_Amp != -1)
		{
			result = result.substring(0,index_Amp);
		}
		return Integer.parseInt(result);
	}

	
	public int numberOfResultsPageWise(int page , String key, String responseHTML) throws IOException
	{
	
		//NULL CHECK
		if(responseHTML.isEmpty())
			 	return 0;
		
		int index = responseHTML.lastIndexOf("id=\"quickLookItem-");
		
		//If 0 results come
		if(index == -1)
				return 0;
		
		String quickLookItem = responseHTML.substring(index, index+22);
		
		String result = quickLookItem.substring(quickLookItem.lastIndexOf("-")+1,quickLookItem.lastIndexOf("\">"));
		return Integer.parseInt(result);
	}

}
