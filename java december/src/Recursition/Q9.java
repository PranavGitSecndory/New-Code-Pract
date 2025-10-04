//9. How do you reverse a string using recursion in Java?
package Recursition;

public class Q9 {
	public static String revers(String s)
	{
		if(s.length() > 0)
		{
			return revers(s.substring(1))+s.charAt(0);
		}
		else
		{
			return s;
		}
	}
public static void main(String[] args) {
	String s="Nikhil";
	
	String res=Q9.revers(s);
	System.out.println("String reverese is : "+res);
}
}
