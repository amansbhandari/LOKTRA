package Client;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import fireRequest.HTTPSend;
import requestHandler.HTTPRequest;
import requestHandler.ToStringManipulator;
import requestHandler.URLForm;
import WebCrawler.Constants;
import WebCrawler.QueryParams;
import WebCrawler.WebCrawlerServices;

public class ClientRequests {

	public static void main(String[] args) throws IOException 
	{
		WebCrawlerServices wc = new WebCrawlerServices();
		if(args.length == 1)
		{
			QueryParams params = new QueryParams(args[0]);
			System.out.println("Total Number of results for Keyword '"+ args[0] +"' is "+ findResults(params));
		}
		else
		{
			QueryParams params = new QueryParams(args[0],Integer.parseInt(args[1]));
			System.out.println("Total Number of results for Keyword '"+ args[0] +"' on page number "+ args[1] + " is "+ findResults(params));
		}
		
		

		
	}
	
	public static int findResults(QueryParams params) throws IOException
	{
		URLForm urlForm= new URLForm();
		String url = urlForm.form(Constants.SHOPPING, params);
		
		//get HTTP connection
		URL obj = new URL(url);
		HTTPRequest request = new HTTPRequest(obj);
		HttpURLConnection con = request.prepareGet();
		
		HTTPSend httpSend = new HTTPSend(con);
		InputStream in = httpSend.send();
		
		ToStringManipulator manipulate = new ToStringManipulator(in);
		String result = manipulate.responseConversion();
		
		WebCrawlerServices wc = new WebCrawlerServices();
		return wc.direct(params, result);
		
	}

}
