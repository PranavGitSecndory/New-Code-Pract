//6. Handle StringIndexOutOfBoundsException
//when accessing an invalid index of a string.
package Exception;

public class Throws_key_Q6 {
	static void print()
	{
		String s="nick";
		try {
			System.out.println(s.charAt(20));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	print();
	
}
}
