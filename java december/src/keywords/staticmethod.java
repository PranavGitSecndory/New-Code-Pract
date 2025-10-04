package keywords;

public class staticmethod {
	
	static void prr()
	{
		System.out.println("dj sagar");
		n1();
	}
	static void n1()
	{
		System.out.println("dj shiva");
	}
	 void n2()
	{
		System.out.println(" dj nick");
		prr();
	}
	public static void main(String arg[])
	{
		staticmethod ob=new staticmethod();
		ob.n2();
	}
	
}
