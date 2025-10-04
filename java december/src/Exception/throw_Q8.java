//8. Throw UnsupportedOperationException for an unavailable feature.  
package Exception;

public class throw_Q8 {
	static void Question8() {
		String a="nick";
		int num;
		try {
			num=Integer.parseInt(a);
		}
		catch(NumberFormatException e)
		{
			throw new UnsupportedOperationException("this is unavallaible");
		}
		
	}
public static void main(String[] args) {
	Question8();
}
}
