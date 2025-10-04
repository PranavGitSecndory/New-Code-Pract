//4. Throw NumberFormatException for invalid number conversion.  
package Exception;

public class Throw_Q4 {
	static void Question4()
	{
		int a=-1;
		if(a<0)
		{
			throw new NumberFormatException("invalid number");
		}
		System.out.println(a);
	}
public static void main(String[] args) {
	Question4();
}
}
