package returnt.nopara.pkg;
import java.util.Scanner;
public class Major_element {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		int a[]=new int[6];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		Major_element ob= new Major_element();
		
		ob.majorti(a);
	}

		public int[] majorti(int a[])
		{
			System.out.println("mejority element is");
			int k=a.length/2;
			int x=0;
			for(int i=0; i<a.length; i++)
			{
				int count=0;
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						count++;
						x=a[i];
					}
				}
				if(count>=k)
				{
					System.out.println(x+" ");
				
				}	
			}
			
			return a;
		}
}
