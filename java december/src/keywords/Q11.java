package keywords;
class father1
{
	public father1(int a,int b)
	{
		
		System.out.println("father const call");
	}
	
}
class child1 extends father1
{
	public child1(int a,int b)
	{
		super(a,b);
		System.out.println("child const call");
		System.out.println();
	}
}
public class Q11 {
	
	public static void main(String arg[])
	{
	child1 ob=new child1(10,20);
	
	}
}
