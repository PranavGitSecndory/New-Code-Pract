package Array;
import java.util.Scanner;
public class Countduplicate {

	public void dupl(int a[])
	{
		int lock=-1;
		int count=0;
		
		for(int i=0; i<a.length; i++)
			{
				if(a[i] == lock)
					continue;
				
				count=1;
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i] == a[j])
					{
						a[j]=lock;
						count++;
					}
				}
				if(count>1)
				{
					System.out.println("duplicate element is ="+a[i]+"count is="+count);
				}
				
			}
	}
	
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in))
		{
			Countduplicate ob=new Countduplicate();
			
			System.out.println("enter the number of element");
			int n=sc.nextInt();
			int a[]= new int [n];
			
			System.out.println("enter the new element of the array");
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			
			ob.dupl(a);
		}
	}
}






 
