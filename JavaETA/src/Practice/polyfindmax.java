package Practice;

public class polyfindmax {
	void findmax(int a,int b)
	{
		if(a>b)
		{
			System.out.println("max number is="+a);
		}
		else
		{
			System.out.println("max number is="+b);
		}
	}
	void findmax(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println("max number is="+a);
		}
		else if( b>c)
		{
			System.out.println("max number is="+b);
		}
		else
		{
			System.out.println("max number is="+c);
		}
	}
	public static void main(String args[])
	{
		polyfindmax ob=new polyfindmax();
		ob.findmax(10,20);
		ob.findmax(10,30,20);
		
	}
}
