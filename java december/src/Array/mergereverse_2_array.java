package Array;

public class mergereverse_2_array {
	public static void main (String [] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= new int[a.length+b.length];
		
		int x=0;
		
			for(int i=0; i<a.length;  i++)
			{
				c[x]=a[i];
			  x++;
			}
			
			for(int i=0; i<b.length;  i++)
			{
				c[x]=b[i];
				x++;
			}
			System.out.println("revers array is");
			for(int i=c.length-1; i>=0; i--)
			{
				System.out.println(c[i]+" ");
			}
		
				
		}
}
