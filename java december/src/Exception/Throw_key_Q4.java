//4. Handle NullPointerException when calling a method on a null object.  
package Exception;

public class Throw_key_Q4 {
	static void print()
	{
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	print();
}
}
