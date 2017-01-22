package fireRequest;

import java.io.IOException;
import java.io.InputStream;

/*
 * Can be implemented for any requests 
 * for now only http.
 * But in future FTP , SFTP(other protocols) requests can also implement this interface to fire requests
 
 */
public interface Request 
{
	public Object send() throws IOException;
}
