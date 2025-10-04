//
//5. Write a recursive Java method to compute the
//sum of all odd numbers up to a given number N.
package Recursition;

import java.util.Scanner;

public class Q5 {
	public static int odd(int a)
	{
		if(a>0)
		{
			if(a%2==1)
			{
				return a+odd(a-1); 
			}
			else
			{
				return odd(a-1);
			}
		}
		else
		{
			return 0;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	
	int res =Q5.odd(a);
	System.out.println("sum of odd number betveen number : "+res);
	
}
}
