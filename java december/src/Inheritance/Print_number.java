package Inheritance;
class Parentt
{
	void v()
	{
		for(int i=1; i<=100; i++)
		{
			System.out.print(i+" ");
		}
	}
}
class childd1 extends Parentt
{
	void print()
	{
		for(int i=101; i<=200; i++)
		{
			System.out.print(i+" ");
		}
	}
}
class childd2 extends childd1
{
	void show()
	{
		for(int i=201; i<=300; i++)
		{
			System.out.print(i+" ");
		}
	}
}
public class Print_number {
	public static void main(String args[])
	{
	Parentt p1=new Parentt();
	p1.v();
	
	System.out.println("==================");
	childd1 c=new childd1();
	c.print();
	
System.out.println("===================================");
	childd2 c1=new childd2();
	c1.show();
	}

}
