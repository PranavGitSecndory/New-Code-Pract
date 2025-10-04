package Abstraction;
abstract class animal
{
	 abstract void sound();
	
}
class Lion extends animal
{
	void sound()
	{
		System.out.println("Lion sound is roar");
	}
}
class Tiger extends animal
{
	void sound()
	{
		System.out.println("Tiger sound is growl");
	}
}
public class animal_Abbstraction 
{
 public static void main(String args[])
 {
       
        	   animal ob;
        	   ob=new Lion();
        	  ob.sound();
        	  ob=new Tiger();
        	  ob.sound();
 }

}
