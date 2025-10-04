//10. Write a Java program to catch and handle
//a string index out-of-bounds exception.  
package Exception;

public class Q10 {
	static void Question10()
	{
		String s="nick";
		try {
			System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Question10();
}
}
