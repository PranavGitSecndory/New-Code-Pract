package keywords;
class father
{
	int a=10;int b=20;
}
class child extends father
{
	void print()
	{
		int c=super.a+super.b;
		System.out.println(c);
	}
}
public class super_ {
	public static void main(String arg[])
	{
		child ob=new child();
		ob.print();
		
	}
}
