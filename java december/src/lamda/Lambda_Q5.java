//5. Convert String to Uppercase: Write a lambda
//expression that takes a string and returns it in uppercase.
package lamda;
interface uppercase
{
	public String convert(String s);
}
public class Lambda_Q5 {
public static void main(String[] args) {
	uppercase ob =(String s)->
	{
		return s.toUpperCase();
	};
	String s =ob.convert("hello nick");
	System.out.println(s);
	
}
}
