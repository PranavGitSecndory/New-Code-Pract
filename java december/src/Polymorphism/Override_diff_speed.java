package Polymorphism;
class vehical
{
	void speedup()
	{
		System.out.println("range of speed 150");
	}
}
class car extends vehical
{
	void speedup()
	{
		System.out.println("high of speed car 200");
	}
}
class bicycle extends car
{
	void speedup()
	{
		System.out.println("low of speed bicycle 100");
	}
}

public class Override_diff_speed {
	public static void main(String arg[])
	{
		vehical v;
		
		v=new vehical();
		v.speedup();
		
		v=new car();
		v.speedup();
		
		v=new bicycle();
		v.speedup();
	}
}
