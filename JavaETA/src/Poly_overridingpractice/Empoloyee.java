package Poly_overridingpractice;
	class employee
	{
		void calcusal()
		{
			System.out.println("calculatr the salary of empoley");
		}
	}
	class manger extends employee
	{
		void calcusal()
		{
			System.out.println("calculatr the salary of manger");
		}
	}
	class programer extends employee
	{
		void calcusal()
		{
			System.out.println("calculatr the salary of programer");
		}
	}
public class Empoloyee {
	public static void main(String args[])
	{
		employee ob;
		
		ob=new manger();
		ob.calcusal();
		
		ob=new programer();
		ob.calcusal();
		
		
	}
}
