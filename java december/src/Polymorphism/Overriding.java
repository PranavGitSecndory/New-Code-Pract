package Polymorphism;

 
class father
	{
		void repair()
		{
			System.out.println("repair the typewriter");
		}
	}
	class child extends father
	{
		void repair()
		{
			System.out.println("repait the computers");
		}
	}
	class gchild extends child
	{
		void repair()
		{
			System.out.println("repair computer and Xerox machine");
		}
	}
	public class Overriding {
		
	public static void main(String arg[])
	{
		father fa;
		
		fa= new father();
		fa.repair();
		
		fa=new child();
		fa.repair();
		
		fa=new gchild();
		fa.repair();
	}
}
