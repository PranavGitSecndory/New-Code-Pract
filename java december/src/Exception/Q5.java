//5. Write a Java program to handle multiple 
//exceptions using multiple catch blocks.  
package Exception;

public class Q5 {
	static void Question5()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
	
public static void main(String[] args) {
	Question5();
}
}
