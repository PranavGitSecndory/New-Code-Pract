package Poly_overridingpractice;
class parent
	{
		void demo(int b )
		{
			System.out.println("repaire type writer");
		}
	}
class child extends parent
{
	void demo(int b )
	{
		System.out.println("repaire computer");
	}
}
class child1 extends parent
{
	void demo(int b )
	{
		System.out.println("repaire mobile");
	}
}
public class OverridingPoly {

	public static void main(String args[])
	{
		parent ob=new child();
		ob.demo(1);
		parent ob1=new child1();
		ob1.demo(2);
		
		
		parent ob3;
		ob3=new child();
		ob3.demo(1);
		ob3=new child1();
		ob3.demo(2);
		
		child c=new child();
		parent pan=c;
		pan.demo(0);
		child1 c1=new child1();
		parent pan1=c1;
		pan1.demo(0);
	}
	
}
