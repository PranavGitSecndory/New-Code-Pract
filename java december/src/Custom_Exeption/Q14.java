//14. Write a program that throws an InvalidPhoneNumberException 
//if the phone number has less than 10 digits.  
package Custom_Exeption;

import java.util.Scanner;

class InvalidPhoneNumber extends Exception
{
	InvalidPhoneNumber(String s)
	{
		super(s);
	}
}
public class Q14 {
	static void number(String num) throws InvalidPhoneNumber
	{
		if(num.length() < 10 || num.length() > 10)
		{
			throw new InvalidPhoneNumber("plzz enter the valid number");
		}
		else
		{
			System.out.println("number is valid !");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	String number =sc.nextLine();
	try {
		number(number);
	} catch (Exception e) {
	System.out.println(e);
	}
}
}
