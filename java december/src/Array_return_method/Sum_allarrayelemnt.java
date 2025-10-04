package Array_return_method;
import java.util.Scanner;
public class Sum_allarrayelemnt {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Sum_allarrayelemnt ob=new Sum_allarrayelemnt();
		
		System.out.println("enter the array elemnet");
		int a[]=new int[5];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=ob.sum(a);
		System.out.println("sum of all element = "+k);
	}
	int sum(int a[])
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		return sum;
		
	}
}
