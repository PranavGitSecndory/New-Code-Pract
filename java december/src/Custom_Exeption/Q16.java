//16. Implement an InvalidAgeException to check the 
//eligibility for a driving license.  
package Custom_Exeption;

import java.util.Scanner;

class InvalidAge extends Exception
{
	InvalidAge(String s)
	{
		super(s);
	}
}


public class Q16 {
	static void validage(int age) throws InvalidAge
	{
		if(age<18)
		{
			throw new InvalidAge("not eligibility for a driving license.");
		}
		else
		{
			System.out.println("eligibil for a driving license.");
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
