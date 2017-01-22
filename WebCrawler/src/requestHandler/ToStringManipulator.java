package requestHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Single Responsibility : to convert inputstream to string
 */
public class ToStringManipulator implements ResponseHandler
{
	private InputStream ins;
	
	
	public ToStringManipulator(InputStream ins)
	{
		this.ins = ins;
	}


	@Override
	public String responseConversion() throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(ins));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//Convert to String
		return response.toString();
	}
	
	

}
