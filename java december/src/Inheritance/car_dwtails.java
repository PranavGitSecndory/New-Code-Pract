package Inheritance;
class vechicle
{
	
	void display(int speed, int fcap)
	{
		System.out.println("speed of car is= "+speed);
		System.out.println("fuel in the  car is= "+fcap);
	}
}
class car extends  vechicle
{
	
	void display(int numdoors)
	{
		System.out.println("number of doors  in car is = "+numdoors);
	}
}
public class car_dwtails {
	public static void main(String[] args) {
		car ob=new car();
		ob.display(100,50);
		ob.display(4);
	}

}
