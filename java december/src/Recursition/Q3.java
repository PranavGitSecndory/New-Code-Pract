//3. Write a recursive Java method to compute the
//sum of all even numbers up to a given number N.
package Recursition;

import java.util.Scanner;

public class Q3 {
	public static int even(int a)
	{
		if(a>0)
		{
			if(a%2==0)
			{
				return a+even(a-1); 
			}
			else
			{
				return even(a-1);
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
	
	int res =Q3.even(a);
	System.out.println("sum of even number betveen number : "+res);
	
}
}
