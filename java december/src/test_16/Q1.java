//4. Write a function to check if a given string is a palindrome,
//ignoring case and non-alphanumeric characters.  
package test_16;

import java.util.Scanner;

public class Q1 {
	void pallen(String s)
	{
		s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
		String k="";
		for(int i=s.length()-1; i>=0; i--)
		{
			k+=s.charAt(i);
		}
		if(s.equals(k))
		{
			System.out.println("String is pallen");
		}
		else
		{
			System.out.println("String is not pallen");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sting");
	String s=sc.nextLine();
	Q1 ob=new Q1();
	ob.pallen(s);
}
}
