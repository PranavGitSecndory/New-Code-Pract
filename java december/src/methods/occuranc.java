package methods;
import java.util.Scanner;
public class occuranc {
	public static void main(String []args)
	{
		occuranc ob=new occuranc();
		ob.occ();
	}
	void occ()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
		int []a=new int[7];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		}
		System.out.println(x+" occurs "+count+" times in array");
		}

	}

