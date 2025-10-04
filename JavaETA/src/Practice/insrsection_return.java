package Practice;

public class insrsection_return {
	
	int[] insertion(int a[],int b[])
	{
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
				
					System.out.println(a[i]);
				}
			}
		}
		
		
		return a;
	}

	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {3,4,5,6,7,8};
		
		insrsection_return ob =new insrsection_return();
		ob.insertion(a,b);
	}
}
