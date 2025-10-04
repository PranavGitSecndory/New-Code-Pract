package methods;
import java .util.Scanner;
public class max_product {
	public static void main(String []args)
	{
		max_product ob=new max_product();
		ob.max();
	}
	void max()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("element the array" );

		int a[] =new int[8];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}

		for(int i=0; i<a.length; i++)
		{	
			int temp=0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
		
				}
			}
			
		}

		int sum=0,max=0;
		int temp1=0,temp2=0;
		for(int i=0; i<a.length; i++)
		{	
			
			for(int j=i+1; j<a.length; j++)
			{			sum=a[i]*a[j];
	                       				 if(sum>max)
	                       		   {
	                             		 temp1=a[i];
					temp2=a[j];
					max=sum;
	               	            }
					break;
				}
			}
	          System.out.println("Max two intgers ="+temp1+" & "+temp2+" ="+max);
	}	

	}

