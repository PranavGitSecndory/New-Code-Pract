//3. Write a Java program to handle a null pointer exception.  
package Exception;

public class Q3 {
	static void Question3()
	{
		String s=null;
		try {
			System.out.println(s.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
	}
public static void main(String[] args) {
	Question3();
}
}
