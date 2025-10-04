//7. Write a program that reads an integer from the user using 
//Scanner and handles InputMismatchException if the user enters 
//a non-integer value.
package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws_key_Q7 {
	static void print()
	{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the number");
			int a=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.err.println(e);
		}
	}
public static void main(String[] args) {
	print();
}
}
