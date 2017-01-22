package requestHandler;

import java.io.IOException;

/*
 * can be implemented to handle/convert response accordingly 
 * Only InputStream to string is done for now
 * But other customized  conversion can be done by implementing this 
 */
public interface ResponseHandler 
{
	Object responseConversion() throws IOException;
}
