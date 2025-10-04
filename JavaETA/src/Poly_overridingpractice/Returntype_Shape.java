package Poly_overridingpractice;
	class shapee
	{
		int getarea(int a)
		{
			return a;
			
		}
		int getparameter(int a)
		{
			return a;
		}
	}
	class circlee extends shapee
	{
		int getarea(int a)
		{
			double pi=3.14;
			System.out.println(pi*(a*a)+"area of circle");
			return a;
		}
		int getparameter(int a)
		{
			double pi=3.14;
			System.out.println(pi*(2*a)+"parameter of circle");
			return a;
		}
	}
	class rectanglee extends shapee
	{
		int getarea(int a)
		{
			int b= 4;
			System.out.println((a*b)+" area of reactangle");
			return a;
			
		}
		int getparameter(int a)
		{
			int b=4;
			System.out.println(2*(a*b)+ " parameter of rectangle");
			return a;
		}
		
	}
	class triangle extends shapee
	{
		int getarea(int a)
		{
			double p =0.5;
			int base=4;
			System.out.println(p*(base*a)+" area of triangle");
			return a;
			
		}
		int getparameter(int a)
		{
			int b=4;int c=5;
			System.out.println((a+b+c)+" parameter of triangle");
			return a;
		}
		
	}

public class Returntype_Shape {
	public static void main(String args[])
	{
		int a=4;
		shapee ob;
		ob= new circlee();
		ob.getarea(a);
		ob.getparameter(a);
		ob= new rectanglee();
		ob.getarea(a);
		ob.getparameter(a);
		ob= new triangle();
		ob.getarea(a);
		ob.getparameter(a);

		
	}

}
