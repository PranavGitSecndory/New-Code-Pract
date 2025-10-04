package Array;
import java.util.Scanner;
public class Find_avg {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Find_avg ob=new Find_avg();
		
		System.out.println("entet the arrayb element");
		int a[]=new int[5];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=ob.avg(a);
		System.out.println("avg of all elemnet is = "+k);
	}
	int avg (int a[])
	{
		int k=a.length;
		int sum=0,avg=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		avg=sum/k;
		return avg;
	}
}
