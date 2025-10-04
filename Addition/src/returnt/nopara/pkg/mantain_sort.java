package returnt.nopara.pkg;
import java.util.Scanner;
public class mantain_sort {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first array");
		int a[]= new int[5];
		for(int i =0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the second array");
		int b[]= new int[3];
		for(int i =0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		mantain_sort ob=new mantain_sort();
		ob.sort(a,b);
		
		
	}
		public int[] sort(int a[],int b[])
		{
			int c[]=new int [a.length+b.length];
			int x=0;
			for(int i=0; i<a.length; i++)
			{
				c[i]=a[i];
				x++;
			}
			for(int i=0; i<b.length; i++)
			{
				c[x]=b[i];
				x++;
			}
			
			System.out.println("the merge array");
			for(int i=0; i<c.length; i++)
			{
				System.out.println(c[i]+" ");
			}
			System.out.println("sotrt the c array");
			
			for(int i=0; i<c.length; i++)
			{
				int temp=0;
				for(int j=i+1; j<c.length; j++)
				{
					if(c[i]>c[j])
					{
						temp=c[i];
						c[i]=c[j];
						c[j]=temp;
					}
				}
				System.out.println(c[i]+" ");

			}
			int p[]=new int[a.length];
			int y=0;
			for(int i=0; i<a.length; i++)
			{
				p[i]=c[i];
				y++;
			}
			
			System.out.println("print array a");
			for(int i=0; i<p.length; i++)
			{
				System.out.println(p[i]+" ");
			}
		
			
		int q[]=new int[b.length];
		for(int i=0; i<q.length; i++)
		{
			q[i]=c[y];
			y++;
		}
			
		System.out.println("print array b");
		for(int i=0; i<q.length; i++)
		{
			System.out.println(q[i]+" ");
		}
			return c;
		}	
		
}
