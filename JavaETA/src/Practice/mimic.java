package Practice;

public class mimic {
	void print()
	{
		System.out.println("hello ");
	}
	void print(String s)
	{
		System.out.println("nikhil "+s);
	}
	public static void main(String args[])
	{
		mimic ob=new mimic();
		ob.print();
		ob.print("dj");
	}
}
