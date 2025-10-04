package return_type_para;
import java.util.Scanner;
public class armstrong {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		armstrong ob=new armstrong();
		
		System.out.println("enter the number");
		int k=sc.nextInt();
		String d=ob.armstrong_or_not(k);
		System.out.println(d);
	}
	String armstrong_or_not(int a)
	{
		int rem=0,sum=0;
		for(int i=a; i>0; i=i/10)
		{
			rem=i%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==a)
		{
			return "it is a aamstrong number";
		}
		else
		{
			return "it is not a aarmstrong number";
		}
	}
	

}
