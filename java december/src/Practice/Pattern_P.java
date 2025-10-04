package Practice;

public class Pattern_P {
	public static void main(String[] args) {
		
	for(int i =1; i<=3; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print(j+" ");
		}
		for(int j=i; j<=2; j++)
		{
			System.out.print("  ");
		}
		for(int j=4; j<=5; j++)
		{
			if(i==2 || i==3)
			{
				System.out.print(" "+j);
			}
			if(j==5 && i==1)
			{
				System.out.print("   "+j);	
			}
		}
		System.out.println();
	}
}}
