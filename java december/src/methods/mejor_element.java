package methods;
import java.util.Scanner;
public class mejor_element {
	public static void main(String[]args)
	{
		mejor_element ob=new mejor_element();
		ob.mejor();
	}
	void mejor()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
			int []a=new int[9];
			for(int i=0;i<a.length;i++)
			{
			a[i]=sc.nextInt();
			}
			int k=a.length/2;
			for(int i=0;i<a.length;i++)
			{
				int count=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				if(count>=k)
				{
					System.out.println(a[i]+" Appears mote than a.length time");
				}
			}

	}
}
