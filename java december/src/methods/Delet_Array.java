package methods;
import java.util.Scanner;
public class Delet_Array {
	public static void main(String []args)
	{
		Delet_Array ob =new Delet_Array();
		ob.delet_dup();
	}
	void delet_dup()
	{
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6};
		System.out.println("arry elemnt to dlt");
		int n=sc.nextInt();
		
		for(int i=0; i<a.length; i++)
		{
			if(n==a[i])
			{
				a[i]=-1;
				System.out.print(a[i]+" ");
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
		
		
	}

}
