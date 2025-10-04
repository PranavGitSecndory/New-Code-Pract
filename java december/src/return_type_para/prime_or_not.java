package return_type_para;
import java.util.Scanner;
public class prime_or_not {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		prime_or_not ob=new prime_or_not();
		
		System.out.println("enter the number");
		int k=sc.nextInt();
		String b=ob.checkprime(k);
		System.out.println(b);
		
	}
	String checkprime(int a)
	{
		int c=0;
		for(int i=1; i<=a; i++ )
		{
			if(a%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return "it is prime number";
		}
		else
		{
			return "it is not a prime number";
		}
	}
}
