package No_return_pkg;
import java.util.Iterator;
import java.util.Scanner;
public class maxproduct {

	
	
	public static void main(String args[])
	{
		
	
		int a[]=new int[5];	
		System.out.println("enter the array");
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		maxproduct ob=new maxproduct();
		ob.product(a);
	}
	
	public void product(int a[]) 
	
	{
		
		for(int i=0; i<a.length; i++)
		{
			int temp=0;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
			}
		}
	   for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}

		int mul=a[a.length-2]*a[a.length-1];
	   
	System.out.println(a[a.length-2]+"*"+a[a.length-1]+"="+mul);
	}
}
