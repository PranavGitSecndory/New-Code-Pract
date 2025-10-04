package Inheritance;
class san //it was a parent class
{
	void print()
	{
		System.out.println("san class print");
	}
}
class nick extends san  //it is a child class
{
	void display()
	{
		System.out.println("nick class display");
	}
}

public class Demo_inheritance {//   Single level inheritance perform
	public static void main(String args[])
	{
		san san=new san();
		san.print();
		
		nick nik= new nick(); //extent child then call parent class method
		nik.display();
		nik.print();
		
	}
}
