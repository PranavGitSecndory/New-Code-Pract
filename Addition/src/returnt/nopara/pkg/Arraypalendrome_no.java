package returnt.nopara.pkg;
import java.util.Scanner;
public class Arraypalendrome_no
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int st=sc.nextInt();
		System.out.println("enter the end range");
		int la=sc.nextInt();
		
		Arraypalendrome_no ob=new Arraypalendrome_no();
		int k[]=ob.palla(st, la);
		
		System.out.println("palendrome no is=");
		for(int i=0; i<k.length; i++)
		{
			System.out.println(k[i]);
		}
	}

	

	public int[] palla(int st, int la)
	{
		int rev=0; int rem=0; int count=0;
		for(int i=st; i<=la; i++)
		{
			rev=0;
			for(int j=i; j>0; j=j/10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==i)
			{
				count++;
			}
		}
		int a[]=new int[count];
		int k=0;
		for(int i=st; i<=la; i++)
		{
			rev=0;
			for(int j=i; j>0; j=j/10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==i)
			{
				a[k]=i;
				k++;
			}
		}
			return a;
	}
	}
	

