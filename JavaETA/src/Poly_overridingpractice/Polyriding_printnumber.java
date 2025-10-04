package Poly_overridingpractice;
	class parent1
	{
		void print()
		{
			for(int i=1; i<=100; i++)
			{
				System.out.println(i);
			}
		}
	}
	class child4 extends parent1
	{
		void print()
		{
			for(int i=101; i<=200; i++)
			{
				System.out.println(i);
			}
		}
	}
	class child5 extends parent1
	{
		void print()
		{
			for(int i=201; i<=300; i++)
			{
				System.out.println(i);
			}
		}	
	}


public class Polyriding_printnumber {
	public static void main(String args[])
	{
		parent1 ob=new child4();
		ob.print();
	}
}
