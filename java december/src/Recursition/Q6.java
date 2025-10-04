//6. Create a Java method to calculate the sum of digits 
//of a positive integer using recursion.
package Recursition;

import java.util.Scanner;

public class Q6 {

	public static int pos(int a)
	{
		if(a>0)
		{
			
				return a%10 +pos(a/10); 
			
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
	
	int res =Q6.pos(a);
	System.out.println("sum of positive number betveen number : "+res);
	

}
}
