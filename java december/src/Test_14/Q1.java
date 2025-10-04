//1.Check if a given string is a palindrome (ignore spaces and case).
//Input: "Madam In Eden Im Adam" → Output: Palindrome
package Test_14;

public class Q1 {
	void pallen(String s)
	{
		s=s.replace(" ", "");
		s=s.toLowerCase();
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
			System.out.println("String is not pallendrome");
		}
	}
public static void main(String[] args) {
	Q1 ob=new Q1();
	String s="Madam In Eden im adam";
	ob.pallen(s);
}
}
