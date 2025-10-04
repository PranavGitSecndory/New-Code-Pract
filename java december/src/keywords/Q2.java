package keywords;

public class Q2 {
	
	public Q2()
	{
		this("constructor call by this ");
	}
	public Q2(String s)
	{
	System.out.println(s);
	}
	public static void main(String arg[])
	{
		Q2 a=new Q2();
	}
}
