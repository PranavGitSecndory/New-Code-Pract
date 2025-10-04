//4. Create a DivisionByZeroException and throw it when a 
//number is divided by zero.  
package Custom_Exeption;
import java.util.Scanner;
class DivBYZero extends Exception
{
	DivBYZero(String s)
	{
		super(s);
	}
}
public class Q4 {
	static void divide(int a , int b) throws DivBYZero
	{
		if(b==0)
		{
			throw new DivBYZero("you can not divide by zero");
		}
		else
		{
			System.out.println("divdid is ="+(double)(a/b));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println();
		try {
			divide(a,b);	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
