package Recursition;

import java.util.Scanner;

public class Factorial {
	public int fact(int n)
	{
		if(n>0)
		{
			return n * fact(n-1) ;
		}
		else
		{
			return 1;
		}
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number ");
	int s= sc.nextInt();
	
	Factorial ob =new Factorial();
	int result =ob.fact(s);
	System.out.println("Sum of number is : "+result);
}
}
