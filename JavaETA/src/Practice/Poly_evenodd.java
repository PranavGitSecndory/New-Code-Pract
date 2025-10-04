package Practice;

public class Poly_evenodd {
	void evenodd(int a)
	{
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("num is odd");
		}
	}
	void evenodd(long a)
	{
		if(a%2==0)
		{
			System.out.println("numbr is a even");
		}
		else
		{
			System.out.println("number is a odd");
		}
	}
	public static void main(String args[])
	{
		Poly_evenodd ob=new Poly_evenodd();
		ob.evenodd(3);
		ob.evenodd(100000000);
	}

}
