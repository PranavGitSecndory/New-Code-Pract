package Practice;
import java.util.Scanner;
public class arrayreturn {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		arrayreturn ob=new arrayreturn();
		
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		
		int a[]= new int[n];
		int b[]= new int [n];
		
		System.out.println("enter the first array element");
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();	
		}
		System.out.println("enter the second array element ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		int k=ob.find(a,b);
		System.out.println("maximum value of array is = "+k);
		
		
	}
	
	int find(int a[], int b[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
		
				}
			}
		}
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(i==j )
				{
					sum=sum+(a[i]*b[j]);
				}
			}
		}
		return sum;
	}

	
}
