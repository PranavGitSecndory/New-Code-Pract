//7. Write a Java program to catch and handle an
//input mismatch exception. 
package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {
	static void Question7()
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter the number");
			int a=sc.nextInt();
			System.out.println("enter the "+a);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}
	}
	
public static void main(String[] args) {
	Question7();
}
}
