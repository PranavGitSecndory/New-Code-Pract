//10.Write a program that creates a custom exception InvalidAgeException.
//Throw it
//if the age entered is below 18.
package Test_14;

import java.util.Scanner;

class Invalidexeption extends Exception
{
	public Invalidexeption(String a)
	{
		super(a);
	}
}
class display
{
	void checkage(int age) throws Invalidexeption
	{
		if(age<18)
		{
			throw new Invalidexeption("enter valid age");
		}
		else
		{
			System.out.println("age is valid & age is a :"+age);
		}
	}
}
public class Q10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age =sc.nextInt();
	
	display ob=new display();
	try {
		ob.checkage(age);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
