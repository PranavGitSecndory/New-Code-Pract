//4. Write a Java program that catches
	//and handles a number format exception.  
package Exception;

public class Q4 {
	static void Question4()
	{
		String s="123fsf";
		try {
			System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Question4();
	}
}
