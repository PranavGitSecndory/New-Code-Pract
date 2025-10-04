//
//Create a custom exception class InvalidAgeException and 
//use it to validate age (must be ≥18).
package Test_15;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class Q9  extends Exception {
	public void validage(int age) throws InvalidAgeException
	{
		if(age < 18 )
		{
			throw new InvalidAgeException("age must be 18 or above");
		}
		else
		{
			System.out.println("age is valid");
		}
	}
public static void main(String[] args) {
	int age=15;
	Q9 ob=new Q9();
	try {
		ob.validage(age);
	} catch (InvalidAgeException e) {
		System.out.println(e);
	}
}
}
