package requestHandler;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;

/*
 * Can be implemented to prepare get method of any protocol
 * For now only http
 * later can be implemented for FTP SFTP or DB calls as well
 */
public interface Request 
{
	Object prepareGet() throws IOException;

}
