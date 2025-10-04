package No_return_pkg;

public class cunstuctor_demo {
	
	cunstuctor_demo()
	{
		System.out.println("this is non pararmeter");
	}
	cunstuctor_demo(int a)
	{
		System.out.println("this is parameter constuctor");
	}
	cunstuctor_demo(String a)
	{
		System.out.println("this is parameter string constuctor");
	}
	public static void main(String args[])
	{
		cunstuctor_demo ob= new cunstuctor_demo();
		cunstuctor_demo ob1=new cunstuctor_demo(10);
	}
	
}
