//3. Write a program that catches NumberFormatException
//when converting a non-numeric string into an integer.  
package Exception;

public class Throw_key_Q3 {
	static void print()
	{
		String s="234gs";
		try {
		System.out.println(Integer.parseInt(s));
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	print();
}
}
