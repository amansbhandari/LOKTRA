package fireRequest;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/*
 * Single Responsibility : Will send the Http requests
 */
public class HTTPSend implements Request 
{

	private HttpURLConnection in;
	
	public HTTPSend(HttpURLConnection in)
	{
		this.in = in;
	}
	
	@Override
	public InputStream send() throws IOException 
	{
		return in.getInputStream();
	}
	
}
