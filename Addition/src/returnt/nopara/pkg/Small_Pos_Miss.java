package returnt.nopara.pkg;
import java.util.Scanner;
public class Small_Pos_Miss {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		System.out.println("enter the array");
		for(int i=0; i<a.length; i++)
		{
			 a[i]=sc.nextInt();
		}
		
		Small_Pos_Miss ob=new Small_Pos_Miss();
		ob.smallposmiss(a);
		
	}
	
	public int[] smallposmiss(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int positiveSmallMiss=1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==positiveSmallMiss)
			{
				positiveSmallMiss++;
			}
		}
		
		System.out.println("The smallest positive number missing from the array is="+positiveSmallMiss);
	
	return a;
	}
}


