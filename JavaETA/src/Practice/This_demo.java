package Practice;
	class this1
	{
	int a;
	
	void Printthis(int a)
	{
		this.a=a;
	}
	void This()
	{
		System.out.println(a);
	}
	}
public class This_demo {

		public static void main(String args[])
		{
			this1 ob=new this1();
			ob.Printthis(10);
			ob.This();
		}
}
