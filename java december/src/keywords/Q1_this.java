package keywords;

public class Q1_this {
	int a=143;
	void nick()
	{
		int a=100;
		
		System.out.println("local variable = "+a);
		System.out.println("globel variable = "+this.a);
	}
	
	public static void main(String arg[])
	{
		Q1_this ob=new Q1_this();
		ob.nick();
	}
}
