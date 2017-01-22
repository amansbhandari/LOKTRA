package requestHandler;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/*
 * Single Responsibility :Implement Request to prepare HTTP get request
 */
public class HTTPRequest implements Request 
{
	private URL url;
	
	public HTTPRequest(URL url)
	{
		this.url = url;
	}

	@Override
	public HttpURLConnection prepareGet() throws IOException 
	{
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		
		return con;
	}
	
}
