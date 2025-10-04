//1.Write a Java function to print numbers from 1 to N using recursion.
package Recursition;

import java.util.Scanner;

public class Q1 {
	public static String print(int n)
	{
		   if (n == 1)
		   {
	            return "1";
	        }
		   else
		   {
			   return print(n-1)+"."+n;
		   }
			   
	    
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n number");
	int n=sc.nextInt();
	
	String res=print(n);
	System.out.println(res);
}
}
