package Practice;
class base1
{
	int a;
	void print()
	{
		System.out.println("base");
	}
}
class derived1 extends base1
{
	derived1()
	{
		super();
		System.out.println("Constant");
	}
	void initialize(int a)
	{
		super.print();
	}
	public void display()
	{
		System.out.println(a);
	}
}
public class super_immdate_instance {
	
	
		public static void main(String[] args) 
		{
			derived1 ob=new derived1();
		}

}
