package Practice;
import java.util.Scanner;
public class demoarray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a[]=new int[5];

			for(int i=0; i<a.length; i++)
			{
			 a[i]=sc.nextInt();
			}
			
			int sum=0;
			int count=0;
			for(int i=1; i<a.length; i++)
			{
				if(i%2==1)
				{
					System.out.println(a[i]);
					sum=sum+a[i];
					count++;
					
				}
			}
			System.out.println("sum of even  positoin  number="+sum);
			System.err.println("count of enven poss element="+count);
	}

}
