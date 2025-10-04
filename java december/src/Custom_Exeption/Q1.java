//1. Create a custom exception NegativeNumberException 
//and throw it if the user enters a negative number. 
package Custom_Exeption;
import java.util.Scanner;
class checknumber extends Exception
{
	checknumber(String s)
	{
		super(s);
	}
}
public class Q1 {

	static void NumPosOrNot(int a) throws checknumber
	{
		if(a<0)
		{
			throw new checknumber("Number is not valid");
		}
		else
		{
			System.out.println("number is valid");
		}
	}
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int a=sc.nextInt();
			NumPosOrNot(a);
		} catch (Exception e) {
		System.out.println(e);
		e.printStackTrace();
		}
	}
}
