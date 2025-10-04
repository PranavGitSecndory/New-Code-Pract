//13. Implement a program where an exception occurs in the try block,
//but the finally block still executes.  
package Exception;

public class Throws_key_Q13 {
	static void print()
	{
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally bloc print");
		}
	}
public static void main(String[] args) {
	print();
}
}
