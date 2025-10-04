package Array;
import java.util.Scanner;
public class clockrotation {

	void rotation(int a[])
	{
//	int n= {1,2,3,4,5};
	
		int temp=a[a.length-1];
		for(int i=0; i<a.length-1; i++)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
	
	
	System.out.println("array after the roatation");
	for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}
	}



	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		clockrotation ob=new clockrotation();
		int a[]=new int[5];
//	ob.(a,sc);
		System.out.println("enter the rotatioon number");
		int n=sc.nextInt();
		
		System.out.println("before rotation ");
		ob.rotation(a);
		
	}
}