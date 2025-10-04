package Practice;

public class Test8 {
	public static void main(String [] args)
	{
		int a[]={1,3,7,6,8,-1,-10,15};
		System.out.println("all nigative then possitive element is :");
		
		
		
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
		int smallpos=1;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==smallpos)
				{
					smallpos++;
				}
			}
		System.out.println(smallpos+" ");
		
	}

}
