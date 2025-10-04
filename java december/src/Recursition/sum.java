package Recursition;

import java.util.Scanner;


public class sum {
	public int sum1(int n)
	{
		if(n>0)
		{
			return n + sum1(n-1) ;//n=5+sum1 4 //n=4+sum1 3 /n=3
		}
		else
		{
			return 0;
		}
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number ");
	int s= sc.nextInt();
	
	sum ob =new sum();
	int result =ob.sum1(s);
	System.out.println("Sum of number is : "+result);
}
}
