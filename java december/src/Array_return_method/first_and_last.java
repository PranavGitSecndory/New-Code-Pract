package Array_return_method;
import java.util.Scanner;
public class first_and_last {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		first_and_last ob=new first_and_last();
		
		int a[]=new int[5];
		System.out.println("enter the array element");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=ob.printfistlast(a);
		System.out.println("first element is = "+a[0]);
		System.out.println(" last element is = "+a[a.length-1]);
		
	}
	int printfistlast(int a[])
	{
		return a[0];
	}
}
