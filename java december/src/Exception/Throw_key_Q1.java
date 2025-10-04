//1. Write a program to handle ArithmeticException using 
//try-catch while dividing a number by zero.  
package Exception;

public class Throw_key_Q1 {
	static void print()
	{
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	print();
}
}
