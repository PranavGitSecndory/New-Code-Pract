package Abstraction;
	abstract class sort
	{
		abstract void sort();
	}
	
	 class Assinding extends sort
	{
		void sort()
		{
		int a[]= {3,6,4,1,2};
		System.out.println("after sort array");
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]+ " ");
		}
			
		}
	}

public class Sorting
{
	public static void main(String args[])
	{
		sort ob=new Assinding();
		ob.sort();
	}
}
 