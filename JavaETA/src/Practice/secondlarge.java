package Practice;

public class secondlarge 
{
	int[] secmax()
	{
		int a[]= {1,5,7,9,3};
			int max=0;
			int smax=0;
			for(int i=0; i<a.length; i++)
				{
					if(a[i]>max)
					{
						max=a[i];
					}
				}
			for(int i=0; i<a.length; i++)
				{
						if(a[i]>smax && a[i]<max)
						{
							smax=a[i];
						}
				}
			System.out.println("second max is a="+smax);
return a;
	}	
	

			public static void main(String args [])
			{
			
				secondlarge ob=new secondlarge();
				ob.secmax();
			}
			
}
