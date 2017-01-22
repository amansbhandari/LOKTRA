package ReverseHashTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
 
/*
 * to Run Test Cases
 */
 
public class RunHashUnitTest {
 
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ReverseHashUnitTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Test Cases Reverse Hash ran successfully...");
		}
	}
}