package Poly_overridingpractice;
	class vehical
	{
		void speedup()
		{
			System.out.println("speed test");
		}
	}
	class car extends vehical
	{
		void speedup()
		{
			System.out.println("car speed test");
		}
	}
	class bicycle extends vehical
	{
		void speedup()
		{
			System.out.println("bicycle speed test");
		}
	}

public class vehicle {
	public static void main(String args[])
	{
		vehical ob=new car();
		ob.speedup();
		
		vehical ob2=new bicycle();
		ob2.speedup();
		
	}

}
