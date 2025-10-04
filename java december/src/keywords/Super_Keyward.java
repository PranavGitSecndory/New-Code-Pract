package keywords;
class calc //call the members of parent calss using super in child class
{
	public calc() //parent constructor
	{
		System.out.println("this is parent calss constuctor  and calling parent");
	}
	int a=5;int b=6;
}
class mal extends calc
{
	public mal()//it will in constructor call in first line using super
	{
		super();
		System.out.println("this is child calss constuctor ");	
	}
	void add()//method call wit using in the super key to in parent class member call 
	{
		System.out.println("dj Nick");
	int c=super.a+super.b;
	System.out.println(c);
	}
}
public class Super_Keyward {
	public static void main(String arg[])
	{
		mal ob=new mal();
		ob.add();	
	}
}
