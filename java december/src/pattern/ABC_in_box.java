package pattern;

public class ABC_in_box {
	public static void main(String arg[])
	{
		int n=6;
		char d='A';
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=n; j++)
			{
				if(i==0 || i==6 || j==0 || j==6)
				{
					System.out.print("*  ");
				}
				else if(i==j || j==6-i)
				{
					System.out.print(d+"  ");
					d++;
				}	
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	
	}

}
