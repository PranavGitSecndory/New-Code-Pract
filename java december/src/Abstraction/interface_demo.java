package Abstraction;
interface inter_base
{
	void print();
	static void pr()
	{
		
	}
	default void pr2()
	{
		
	}
}
  class Imp implements inter_base
{
	public void print()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.print(i+" ");
		}
	}
}

public class interface_demo {
	public static void main(String[] args) {
		inter_base ob=new  Imp();
		ob.print();
	}
}
