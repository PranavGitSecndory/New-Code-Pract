package methods;
import java.util.Scanner;
public class union_inssertion {
	public static void main(String[]arg)
	{
		union_inssertion ob=new union_inssertion();
		ob.union();
	}
	void union()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array1 Element");
		int []a=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Array2 emement");
		
		int []b=new int[4];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		System.out.println("intersection element is");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		System.out.println();
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		int lock=-1;
		System.out.println("Union in both Array");
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]=lock;
				}
			}
			if(c[i]!=lock)
			{
				System.out.print(c[i]+" ");
			}
		}
		
		}

	
}
