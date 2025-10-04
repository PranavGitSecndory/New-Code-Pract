package Array;
import java.util.Scanner;
public class dj {
	
	class DemoArray
	{
		public static void main(String []args)
		{
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
			int []a=new int[8];
			for(int i=0;i<a.length;i++)
			{
			a[i]=sc.nextInt();
			}
			
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
		}
	}


}
