package ReverseHashTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ReverseHash.HashCode;

/*
 * For Unit Testing
 */

public class ReverseHashUnitTest 
{
	@Test
	public void TestReverseHash()
	{
		long input = 680131659347L;
		HashCode code = new HashCode(input);
		assertEquals(code.reverseHash(),"leepadg");
	}
}
