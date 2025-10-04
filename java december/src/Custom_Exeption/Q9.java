//9. Define an InvalidEmailException that gets triggered
//when an email does not contain '@'.  
package Custom_Exeption;
import java.util.Scanner;
class InvalidEmail extends Exception
{
	InvalidEmail(String s)
	{
		super(s);
	}
}
public class Q9 {
	static void email(String mail) throws InvalidEmail
	{
		if(!mail.contains("@"))
		{
			throw new InvalidEmail(" plzz enter the valid mail ");
		}
		else
		{
			System.out.println("mail is valid!");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mail");
		String mail=sc.nextLine();
		try {
			email(mail);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
