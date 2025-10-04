//Q1. Reverse the vowels only (Flipkart)

//S = "practice"
//Output: prectica
//Explanation: The vowels are a, i, e
//Reverse of these is e, i, a.
package Top_String_Interview;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	String s=sc.next();
	char a[]=s.toCharArray();
	String k="";
	 
	for(int i=0; i<a.length; i++)
	{
		if("AEIOUaeiou".indexOf(a[i]) != -1)
		{
			k+=a[i];
		}
	}
	int L=k.length()-1;
	for(int i=0; i<a.length; i++)
	{
		if("AEIOUaeiou".indexOf(a[i]) != -1)
		{
			a[i]=k.charAt(L);
			L--;
		}
	}
	System.out.println("after the reverse vowel");
	System.out.println(new String(a));
	
}
}
