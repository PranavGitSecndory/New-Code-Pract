package Array_return_method;
import java.util.Scanner;
public class Prime_number {
	public static void main(String[] args) {
		Prime_number ob=new Prime_number();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int n=sc.nextInt();
		int k=sc.nextInt();
		
	 ob.prime(n,k);
		
	}
	void prime(int a,int b)
	{
		System.out.println("even number is");
		
		for(int i=a; i<=b; i++)
		{int count =0;
			for(int j=a;j<=b;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			
				System.out.println(i);
			}
		}
		
		
	}
}
