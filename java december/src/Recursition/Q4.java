//. Write a Java method to count the number of digits
//in an integer using recursion.
package Recursition;

import java.util.Scanner;

public class Q4 {
	public static int count(int a)
	{
		if(a>0)
		{
			return 1 + count(a/10);
		}
		return 0;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	
	int res=Q4.count(a);
	System.out.println("Count of number is a : "+res);
}
}
