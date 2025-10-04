package methods;
import java.util.Scanner;
public class sort2_array {
	public static void main(String[] args)
	{
		sort2_array ob=new sort2_array();
		ob.sort2();
	}
	void sort2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array1 Element");
			int []a=new int[6];
			for(int i=0;i<a.length;i++)
			{
			a[i]=sc.nextInt();
			}
			System.out.println("Enter Array2 Element");
			int b[]=new int[3];
			for(int i=0;i<b.length;i++)
			{
			b[i]=sc.nextInt();
			}
			int z[]=new int[a.length+b.length];
			int m=0;
			for(int i=0;i<a.length;i++)
			{
				z[m]=a[i];
				m++;
			}
			for(int i=0;i<b.length;i++)
			{
				z[m]=b[i];
				m++;
			}
			for(int i=0;i<z.length;i++)
			{
				for(int j=i+1;j<z.length;j++)
				{
					if(z[i]>z[j])
					{
						int temp=z[i];
						z[i]=z[j];
						z[j]=temp;
					}
				}
			}
			int p[]=new int[a.length];
			int x=0;
			int k=b.length;
			for(int i=0;i<z.length-k;i++)
			{
				p[x]=z[i];
				x++;
			}
			
			int q[]=new int[b.length];
			int n=0;
			for(int i=z.length-k;i<z.length;i++)
			{
				q[n]=z[i];
				n++;
			}
			System.out.println("First sorted Array");
			for(int i=0;i<p.length;i++)
			{
				System.out.print(p[i]+" ");
			}
			System.out.println();
			System.out.println("Second sorted Array");
			for(int i=0;i<q.length;i++)
			{
				System.out.print(q[i]+" ");
			}

	}
}
