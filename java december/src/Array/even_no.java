package Array;

public class even_no {
public static void main(String args[])
{
	even_no ob=new even_no();
	
	int a[]= {1,2,3,4,5};
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]+" ");
	}
	int k =ob.even(a);
	System.out.println("first 2nd 3rd element of array = "+k);
}
	int even(int a[])
	{
		int sum=0;
		System.out.println("first three element");
		for(int i=0; i<a.length; i++)
		{
			if(i==0 || i==1 || i==2)
			{
			System.out.println(+a[i]);
			sum=sum+a[i];
			
			}
		}
		

	return sum;
		}
}
