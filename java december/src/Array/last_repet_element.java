package Array;

public class last_repet_element {
	public static void main(String []args) {
		int a[]= {1,2,3,4,2,3,4};
		int x=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					x=a[i];
					
				}

			}
		}
		System.out.println("last reapert elment is = " + x );
		
		
	}

}
