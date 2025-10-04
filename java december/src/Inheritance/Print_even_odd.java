package Inheritance;
class par
{
	void print()
	{
		for(int i=1; i<=100; i++)
		{
			System.out.print(i+" ");
		}
	}
}
class cha1 extends par
{
	void even()
	{
		for(int j=1; j<=100; j++)
		{
		 if(j%2==0)
		 {
			 System.out.print(j+" ");
		 }
		}
	}
}
class cha2 extends cha1
{
	void odd()
	{
		for(int i=1; i<=100; i++)
		{
		 if(i%2==1)
		 {
			 System.out.print(i+" ");
		 }
		}
	}
}

public class Print_even_odd {
	public static void main(String args[])
	{
		System.out.println("print number");
		par p=new par();
		p.print();
		
		System.out.println();
		System.out.println("even nummber");
		cha1 ch1=new cha1();
		ch1.even();
		
		System.out.println();
		System.out.println("odd  number");
		cha2 ch2=new cha2();
		ch2.odd();
	}
}
