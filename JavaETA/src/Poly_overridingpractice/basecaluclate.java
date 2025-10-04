package Poly_overridingpractice;
	class shape
	{
		void claculateArea()
		{
			System.out.println("area of triangele");
			int b=25; int h=5;
			System.out.println(0.5*b*h);
		}
	}
	class circle extends shape
	{
		void claculateArea()
		{
			System.out.println("area of circle");
			int r=5; 
			float pi=(float)3.14;
			System.out.println(pi*r*r);
		}
	}
	class rectangle extends shape
	{
		void claculateArea()
		{
			System.out.println("area of rectangle");
			int b=25; int h=25;
			System.out.println(b*h);
		}
	}

public class basecaluclate {
	public static void main(String args[])
	{
		shape ob1=new shape();
		ob1.claculateArea();
		
		shape ob=new circle();
		ob.claculateArea();
		
		shape ob3=new rectangle();
		ob3.claculateArea();
	}

}
