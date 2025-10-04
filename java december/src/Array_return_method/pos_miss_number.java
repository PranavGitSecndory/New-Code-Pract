package Array_return_method;

import java.util.Arrays;

public class pos_miss_number {

	public static void main(String arg[])
	{
		pos_miss_number ob=new pos_miss_number();
		int a[]= {1,4,3,6,7,8,9,-8,-5,-7,-6,5};
		Arrays.sort(a);
		System.out.println("sorted array is");
		System.out.print(Arrays.toString(a));
		System.out.println();
		
		int k=ob.posssmall(a);
		System.out.println("smallest positive messing number is = "+k);
	}
	int posssmall(int a[])
	{
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
			{
				break;
			}
		}
		return c;
	}
}
