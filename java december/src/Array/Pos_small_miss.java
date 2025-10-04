package Array;

import java.util.Arrays;

public class Pos_small_miss {
	public static void  main(String args[])
	{
		int a[]= {2,3,4,1,7,6,-7,-8,9};
		Arrays.sort(a);
		System.out.println("sorted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int c=1;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<=0)
			{
				continue;
			}
			if(a[i]==c)
			{
				c++;
			}
			else
				break;
		}
		System.out.println("miss small pos no is = "+c);
	}
}
