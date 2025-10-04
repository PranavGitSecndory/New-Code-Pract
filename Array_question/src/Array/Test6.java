package Array;
import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter the element of array");
	
	int a[]=new int[6];
	
	for(int i=0; i<a.length; i++)
	{
		a[i]=sc.nextInt();
	}
	
	System.out.println("sum you have to put");
	int sum=sc.nextInt();
	int temp1=0,temp2=0,temp3=0;
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			for(int k=j+1; k<a.length; k++)
			{
				if(a[i]+a[j]+a[k]==sum)
				{
					temp1=a[i];
					temp2=a[j];
					temp3=a[k];
				}
			}
		}
	}
	System.out.println("treplate is =");
	System.out.println(temp1+"&"+temp2+"&"+temp3);
	
}
}
