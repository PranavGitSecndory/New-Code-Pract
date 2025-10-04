package Custom_Exeption;
import java.util.Scanner;
import javax.swing.text.ChangedCharSetException;
class chackage extends Exception
{
	chackage(String s)
	{
		super(s);
	}
}

public class Custom_Demo {
	static void validage(int age) throws chackage
	{
		if(age<18)
		{
			throw new chackage("Age should be grater");
		}
		else
		{
			System.out.println("age valid");
		}
	}
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int a=sc.nextInt();
		validage(a);
		
		
	} catch (Exception e) {
		System.err.println(e);
		e.printStackTrace();
	}
}
}
