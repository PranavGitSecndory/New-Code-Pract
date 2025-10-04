
//2. Calculate the sum of elements in an integer array using recursion.
package Recursition;

public class Q2 {
	public static int sum(int a[],int i)
	{
		if(a.length>i)
		{
			return a[i] + sum(a,i+1);
		}
		else
		{
			return 0;
		}
	}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int s =sum(a,0);
	System.out.println("Sum is a : "+s);
}
}
