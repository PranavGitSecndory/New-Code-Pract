//Write a Java program to check if a given string is a palindrome.
package Test_15;

public class Q1 {
	void check(String s)
	{
		s= s.toLowerCase();
		String k="";
		for(int i=s.length()-1; i>=0; i--)
		{
			k+=s.charAt(i);
		}
		if(s.equals(k))
		{
			System.out.println("String is pallendrome");
		}
		else
		{
			System.out.println("String is not pallen");
		}
		
	}
public static void main(String[] args) {
	Q1 ob=new Q1();
	String s="madam";
	ob.check(s);
}
}
