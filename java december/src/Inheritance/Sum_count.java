package Inheritance;
import java.util.Scanner;
class parr
{
	void print(int n , int k)
	{
		
		
		System.out.println("print number");
		for(int i=n; i<=k; i++)
		{
			System.out.print(i+" ");
		}
	}
}
class chaa1 extends parr
{
	void even(int n ,int k)
	{
		
		System.out.println("even nummber");
		int sum=0,count=0;
		for(int j=n; j<=k; j++)
		{
		 if(j%2==0)
		 {
			 System.out.print(j+" ");
			 sum= sum+j;
			 count++;
		 }
		}
		System.out.println();
		 System.out.println("sum of even number  = "+sum);
		 System.out.println("count of even number = "+count);
	}
}
class chaa2 extends chaa1
{
	void odd(int n ,int k)
	{
		
		System.out.println("odd  number");
		int sum=0,count=0;
		for(int i=n; i<=k; i++)
		{
		 if(i%2==1)
		 {
			 System.out.print(i+" ");
			 sum+=i;
			 count++;
		 }
		}
		System.out.println();
		 System.out.println("sum of odd number = "+sum);
		 System.out.println("count of even number = "+count);
	}
}
public class Sum_count {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("given range");
		int n=sc.nextInt(); 
		int k=sc.nextInt();
		
		
		parr p=new parr();
		p.print(n,k);
		
		System.out.println();
		
		chaa1 ch1=new chaa1();
		ch1.even(n,k);
		
		System.out.println();
	
		chaa2 ch2=new chaa2();
		ch2.odd(n,k);
		
		
	}	
}
