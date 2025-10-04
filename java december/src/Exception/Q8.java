//8. Write a Java program to demonstrate exception
//handling using a try-catch block. 
package Exception;

public class Q8 {
	static void Question8()
	{
		String s="hello nick";
		try {
			System.out.println(s.charAt(42));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Question8();
}
}
