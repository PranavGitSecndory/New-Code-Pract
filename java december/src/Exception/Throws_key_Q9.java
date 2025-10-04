//9. Write a program that catches multiple exceptions in a 
//single try-catch block (e.g., ArithmeticException and 
		//ArrayIndexOutOfBoundsException).  
package Exception;

public class Throws_key_Q9 {
	static void print()
	{
		try {
			int a=5/0;
		System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	print();
}
}
