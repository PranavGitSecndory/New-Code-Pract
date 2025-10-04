package Array_return_method;

public class Kth_smallest {
	public static void main(String arg[])
	{
		Kth_smallest ob=new Kth_smallest();
		int a[]= {7,10,4,3,20,15};
		int k=3;
		int j=ob.small(a ,k);
		System.out.println(j);
	}

	int small(int a[],int k)
	{
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
		}
		return a[k-1];
		
	}
}
