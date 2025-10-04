package keywords;

public class Q4 {
	void n1()
	{
		n2();
		System.out.println("call nick 1");
	}
	void n2()
	{
		n3();
		System.out.println("call nick 2");
	}
	void n3()
	{
		
		System.out.println("call nick 3");
	}
	public static void main(String arg[])
	{
		Q4 a=new Q4();
		a.n1();
				
	}

}
