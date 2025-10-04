package Array_return_method;
import java.util.Scanner;
public class replace_zero {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			replace_zero ob=new replace_zero();
			
			System.out.println("entetr the atray element");
			int a[]=new int[5];
			 
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			int k=ob.replace(a);
			System.out.println(k);
		}
		int replace(int a[])
		{
		
			for(int i=0;i<a.length; i++)
			{
				if(a[i]==0)
				{
					System.out.println(1);
				}
			
			}
			return 1;
		}

}
