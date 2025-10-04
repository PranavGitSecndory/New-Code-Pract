package Array_return_method;
import java.util.Scanner;
public class perticuler_element_count {
	public static void main(String arg[])
	{
		
		perticuler_element_count ob=new perticuler_element_count();
		int a[] ={1,2,2,4,5};
		
		int k=ob.findcount(a);
		System.out.println("count of perticuler number is = "+k);
	}
	int findcount(int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("particular element");
		int n=sc.nextInt();
		int count=0;
	
	for(int i=0; i<a.length; i++)
	{
		if(n==a[i])
		{
		count++;
		}
	}
	return count;
	}
}
