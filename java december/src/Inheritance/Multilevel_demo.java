package Inheritance;
class parent  //parent class
{
	void print()
	{
		System.out.println("call parent class");
	}
}
class child extends parent  //extend parent class
{
	void display()
	{
		System.out.println("call child class");
	}
}
class grandchild extends child //extent child class
{
	void show()
	{
		System.out.println("call grand child");
	}
}

public class Multilevel_demo { //multilevel inheritance call multiple class
	public static void main(String args[])
	{
		parent p=new parent();
		p.print(); // just call parent class we can not call child class
		
		System.out.println("==================================");
		child c=new child(); //after extend we call parent class 
		c.display();
		c.print();
		
		System.out.println("================================");
		grandchild gc=new grandchild();// after extent parent child we call in grand child class
		gc.show();
		gc.display();
		gc.print();
	}
}
