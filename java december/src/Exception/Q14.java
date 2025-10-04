//14. Write a Java program that uses a try-catch 
//block inside a method. 
package Exception;

public class Q14 {
	static void Question14()
	{
		int a=10;
		int b=20;
		int result =a*b;
		try {
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Question14();
}
}
