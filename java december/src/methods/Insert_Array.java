package methods;
import java .util.Scanner;
public class Insert_Array {
	public static void main(String []args)
	{
		Insert_Array ob=new Insert_Array();
		ob.insert();
	}
	void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ebnter the are element are");
		int a[]= {10,20,30,40};
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		
		System.out.println("enter the new array element");
		int b=sc.nextInt();
		
		System.out.println("arrayb indet to insert array");
		int ind=sc.nextInt();
		
		a[ind]=b;
		System.out.println("the array element are");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
	}
}
