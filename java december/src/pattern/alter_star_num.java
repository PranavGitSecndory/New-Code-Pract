package pattern;

public class alter_star_num {
	public static void main(String []args)
	{
		int x=1;
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i%2!=0)
				{
					if(j%2!=0)
					{
						System.out.print(x);
						x++;
					}
					else
					{
						System.out.print("*");
					}
				}
				else {
					if(j%2!=0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(x);
						x++;
					}
				}
				}	
		}
			System.out.println();
		}
		
	}

