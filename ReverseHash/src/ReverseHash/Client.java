package ReverseHash;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("Enter Hash Code (Press -1 to exit):: ");
			Scanner sc = new Scanner(System.in);
			long input = sc.nextLong();
			
			if(input == -1)
			{
				break;
			}
			
			HashCode code = new HashCode(input);
			System.out.println("Reverse Hash :: "+code.reverseHash());
			
		}
		
		

	}

}
