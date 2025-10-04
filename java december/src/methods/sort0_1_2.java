package methods;
import java.util.Scanner;
public class sort0_1_2 {
	public static void main(String[]arg)
	{
		sort0_1_2 ob=new sort0_1_2();
		ob.pullall0();
		
	}
	void pullall0()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
		int []a=new int[10];
		
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
		System.out.println("Sorted Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}
