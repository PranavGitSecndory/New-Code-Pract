package Array_return_method;

public class print_array {
	public static void main(String args[])
	{
		print_array ob=new print_array();
		int c[]= {1,2,3,4};
		
		int d[]=ob.print(c);
		for(int i=0; i<d.length; i++)
		{
			System.out.print(d[i]+" ");
		}
	}
	int[] print(int a[])
	{
		int b[]=new int[a.length];
		int x=0;
		for(int i=a.length-1;i>=0; i-- )
		{
			b[x]=a[i];
			x++;
		}
		return b;
	}
}
