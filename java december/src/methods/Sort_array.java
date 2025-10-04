package methods;



public class Sort_array {
	public static void main(String []args)
	{
		Sort_array ob =new Sort_array();
		ob.sort();
	}
	void sort()
	{
		int a[]= {3,5,4,2,1,6};
		int temp=0;
		
		for(int i=0; i<=a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
