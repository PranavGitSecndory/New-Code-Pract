//
//5. Given two strings, write a function to check if 
//one is an anagram of the other.
package test_16;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	static void ChackAngram(String s, String k)
	{
		s=s.toLowerCase();
		k=k.toLowerCase();
		if(s.length()!=k.length())
		{
			System.out.println("not anagram");
			return;
		}
		char[] a=s.toCharArray();
		char b[]=k.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b))
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}
			
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first string");
	String s =sc.nextLine();
	System.out.println("Enter second String");
	String k=sc.nextLine();
	ChackAngram(s,k);
}
}
