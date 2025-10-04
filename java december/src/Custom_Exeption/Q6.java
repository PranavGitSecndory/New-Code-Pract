//6. Write a program that throws an InvalidPasswordException
//when the password length is less than 8.  
package Custom_Exeption;
import java.util.Scanner;
class InvalidPassword extends Exception
{
	 InvalidPassword(String s)
	 {
		 super(s);
	 }
}
public class Q6 {
	static void password(String pass) throws InvalidPassword
	{
		if(pass.length() < 8)
		{
			throw new InvalidPassword("Enter a valid password");
		}
		else
		{
			System.out.println("pasword is valid!");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the password");
	String pass=sc.nextLine();
	try {
		password(pass);
	} catch (Exception e) {
		System.out.println(e);
	}
	
}
}
