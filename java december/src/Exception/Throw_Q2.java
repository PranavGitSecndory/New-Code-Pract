//2. Throw NullPointerException if a string is null.
package Exception;

public class Throw_Q2 {
	static void Question2()
	{
		String a=null;
		if(a==null)
		{
			throw new NullPointerException("String is null");
		}
		System.out.println(a.charAt(2));
	}
public static void main(String[] args) {
	Question2();
}
}
