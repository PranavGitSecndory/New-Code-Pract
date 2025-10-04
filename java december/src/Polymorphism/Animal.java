package Polymorphism;
class animall
{	
	void makesound()
	{
		System.out.println("parent class method");
	}
}
class dog extends animall
{
	void makesound()
	{
		super.makesound();
		System.out.println("child class method");
	}
}
public class Animal {
public static void main(String[] args) {
	dog ob=new dog();
	ob.makesound();
}
}
