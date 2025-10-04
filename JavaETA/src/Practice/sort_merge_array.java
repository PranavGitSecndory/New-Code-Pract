package Practice;

public class sort_merge_array {
	int[] sortarray(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int x=0;
		
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
			x++;
		}
		for(int i=0; i<b.length; i++)
		{
			c[x]=b[i]
					;
			x++;
		}
		
		for(int i=0; i<c.length; i++)
		{
			for(int j=i+1; j<c.length; j++)
			{
				if(c[i]>c[j])
				{
					 int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		return c;
	}
	
	public static void main(String args[])
	{
		int a[]= {1,2,5,4,3};
		int b[]= {7,6,8,9,10};
		
		sort_merge_array ob=new sort_merge_array();
		ob.sortarray(a,b);
	}
}
