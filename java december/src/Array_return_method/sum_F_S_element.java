package Array_return_method;
import java.util.Scanner;
public class sum_F_S_element {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		sum_F_S_element ob=new sum_F_S_element();
		
		System.out.println("enter the array element");
		int a[]=new int[5];
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int k=ob.sum(a);
		System.out.println("sum of first and second element = "+k);
	}
	int sum(int a[])
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
		sum=a[0]+a[1];	
		}
		return sum;
	}

}
