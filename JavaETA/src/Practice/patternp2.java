package Practice;

public class patternp2 {
	public static void main(String args[])
	{
		int s=1;
		for(int i=1; i<=7; i++)
		{
			for(int j=7; j>=i; j--)
			{
				System.out.print("  ");
			}
			for(int j=s; j>=1; j--)
			{
				System.out.print(j+" ");	
			}
			s++;
			
		    for(int j=2;j<=i;j++)
		    {
		    	if(i!=1)
		    	{
		    	System.out.print(j+" ");
		    	}
		    }
			System.out.println(" ");
		}	   
	}
	}
