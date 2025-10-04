package methods;
import java.util.Scanner;
public class clocwise {
	public static void main(String[]arg)
	{
		clocwise ob=new clocwise();
		ob.oneclocwise();
	}
	void oneclocwise()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
		int []a=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}	
		int []b=new int[5];
		
		b[0]=a[a.length-1];
		b[b.length-1]=a[0];
		
		for(int i=1;i<a.length-1;i++)
		{
			b[i]=a[i];
		}
		System.out.println("After single rotation array is ");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}

	}
}
