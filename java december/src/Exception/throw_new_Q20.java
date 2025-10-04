//20. Create a method that throws NumberFormatException when
//a non-numeric string is passed as an argument.  
package Exception;

public class throw_new_Q20 {
	static void print(String s)
	{
		
		for(int i=0; i<s.length(); i++)
		{
			if(!Character.isDigit(s.charAt(i)));
			{
				throw new NumberFormatException("\n non numric string pass");
			}
		}
		System.out.println("covert to intger");
	}
public static void main(String[] args) {
	print("nick");
	print("nick455");
}
}
