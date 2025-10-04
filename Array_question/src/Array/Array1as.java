package Array;
import java.util.Scanner;

public class Array1as 
{
	public void merge(int a[],int b[],int c[])
	{
		int x=0;
		for(int i=0; i<a.length; i++)
		{
			c[x]=a[i];
			x++;
		}
		for(int i=0; i<b.length; i++)
		{
			c[x]=b[i];
			x++;
		}
		System.out.println("merging of two array is");
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]+" ");
		}
		System.out.println();
	}
			
		
	public void mergeinput(int a[], int b[],Scanner sc)
	{
		System.out.println("enter the element array first");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element array second");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int [5];
		int b[]=new int [6];
		int c[]=new int[a.length+b.length];
		
		
			
		
		
		Array1as os = new Array1as();
		
		os.mergeinput(a,b,sc );
		os.merge(a,b,c);
	}
	
	

}


