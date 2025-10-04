package keywords;

public class Static_blog {
	
	{
		System.out.println("call instance blog");
	}
	Static_blog()
	{
		System.out.println("call constructor ");
	}
	
	static
	{
		
		System.out.println("call static 1 blog");
	}
	static
	{
		System.out.println("call static 2 blog");
		Static_blog ob=new Static_blog();
	}
	public static void main(String arg[])
	{
		System.out.println("call main method");
		
	}
}
