package Array;

public class merge_2_array {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4};
		int b[]= {5,6,7};
		int c[]= new int [a.length+b.length];
		
		int x = a.length;
		
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[x]=b[i];
			x++;
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
