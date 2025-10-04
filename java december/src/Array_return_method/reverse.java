package Array_return_method;

import java.util.*;

public class reverse {
	public static void main(String args[])
	{
		reverse ob=new reverse();
		int a[]= {1,2,3,4,5};
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		int k=ob.revers(a);
		System.out.println("sum of first and last element = "+k);
	}
	int revers(int a[])
	{
		int sum=a[0]+a[a.length-1];
		return sum;
		
}
}
