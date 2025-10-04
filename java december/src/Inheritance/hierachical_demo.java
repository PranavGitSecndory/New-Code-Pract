package Inheritance;
class parent1
{
	void print()//parent class has a  child we call with extends in all child
	{
		System.out.println("parent class");
	}
}
class child1 extends parent1 //extent child 1 with parent
{
	void display()
	{
		System.out.println("call child 1");
	}
}
class child2 extends parent1 //extent child 2 with parent
{
	void show()
	{
		System.out.println("call child 2");
	}
}
public class hierachical_demo //hierarchical it call multiple child for one parent
{
	public static void main(String arg[])
	{
		child1 c1=new child1();//call parent class in child class
		c1.display();
		c1.print();
		
		System.out.println("============================");
		child2 c2=new child2();// call parent class in child class
		c2.show();
		c2.print();
		
	}
}
