package Array;
import java.util.Scanner;

public class frequancy_count_array {
	public static void main(String []args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter size of array");
		int n=sc.nextInt();
		
	
		System.out.println("enter the arrray element");
		int a[]=new int[n];
		
		
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		
		
			for(int i=0; i<a.length; i++)
			{
				int c=1;
				for(int j=i+1; j<a.length; j++)
				{
				
					if(a[i]==a[j]&&a[i]!='#')
					{
						a[j]='#';
						c++;
					}
				
				}
				if(a[i]!='#')
				{
				System.out.println("repet ele is "+a[i]+":::"+ c );
				}
			}
	}
}
