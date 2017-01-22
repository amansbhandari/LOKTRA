package ReverseHash;

import java.util.Stack;

/*
 * Represents a HashCode for a String 
 * extends Long
 */
public class HashCode 
{
	long code;
	static final String GRAMMER = "acdegilmnoprstuw";
	static final long HASHBASE = 37;
	
	//Value in Code is MUST
	public HashCode(long code)
	{
		this.code = code;
	}
	
	
	public String reverseHash()
	{
		int index = 0;
		Stack<Character> stack = new Stack<Character>();	//To reverse the output String
		
		//Evaluating each character
		while(code != 7)
		{
			 index = (int)(code % HASHBASE);
			 
			 if(code == 0 || index >= GRAMMER.length())
				 	return "Not Found";
			 
			 char ch = GRAMMER.charAt(index);
			 
			 stack.push(new Character(ch));
			 
			 code = (code-index) / HASHBASE; 
		}
		
		//To convert it to String
		String output = "";
		while(!stack.isEmpty())
			output += stack.pop();
		
		return output;
	}
	
	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}
}
