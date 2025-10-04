package Poly_overridingpractice;
	class Animal
	{
		void sound()
		{
			System.out.println("genrate a sounfd");
		}
	}
	class bird extends Animal
	{
		void sound()
		{
			System.out.println("bird sound");
		}
	}
	class cat extends Animal
	{
		void sound()
		{
			System.out.println("cat sound");
		}
	}
public class Animal_poly {
	
	public static void main (String args[])
	{
	Animal ob=new bird();
	ob.sound();
	
	Animal ob1=new cat();
	ob1.sound();
	}
}
