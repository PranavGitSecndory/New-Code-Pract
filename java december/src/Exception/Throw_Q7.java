//7. Throw StringIndexOutOfBoundsException for an invalid string index.  
package Exception;

public class Throw_Q7 {
	static void Question7()
	{
		String a="nick";
		int b=10;
	
		if(b>a.length())
		{
			throw new StringIndexOutOfBoundsException("String not valid");
		}
		System.out.println(a.charAt(b));
		
	}
public static void main(String[] args) {
	Question7();
}
}
