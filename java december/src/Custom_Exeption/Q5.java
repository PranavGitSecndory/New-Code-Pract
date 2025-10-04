//5. Implement a TooYoungException that is thrown when
//a person's age is below 18 for voting.  
package Custom_Exeption;

import java.util.Scanner;
class age extends Exception
{
	age(String s)
	{
		super(s);
	}
}
public class Q5 {
	static void validage(int a) throws age
	{
		if(a<18)
		{
			throw new age("Age should be grater");
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
