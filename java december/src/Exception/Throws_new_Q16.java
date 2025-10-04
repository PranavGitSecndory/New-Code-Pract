//16. Write a program that throws ArithmeticException 
//manually when a number is divided by zero.  
package Exception;

public class Throws_new_Q16 {
	static void print()throws Exception
	{
		System.out.println(5/0);
	}
public static void main(String[] args) {
	try {
	print();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
