package Array;

public class array_2_alt_rever {
	public static void main(String []args) {
		
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]= new int [a.length+b.length];
		
		int x=a.length-1;
		int y=b.length-1;
		
		for(int i=0; i<c.length; i++) 
		{
			if(i%2==0)
			{
				c[i]=a[x];
				x--;
			}
			else
			{
				c[i]=b[y];
				y--;
			}
		}
		
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]+" ");
		}
		
		
	}

}
