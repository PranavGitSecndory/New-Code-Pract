//Create overloaded methods named calculateSum that calculate the sum of integers.
//One method should take two integers, and another should take three integers.



package Practice;

public class polyQ1 {
	void calculatesum(int a, int b)
	{
		System.out.println(a+b);
	}
	void calculatesum(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main()
	{
		polyQ1 ob1=new polyQ1();
		ob1.calculatesum(10,20);
		ob1.calculatesum(10,20,30);
	}
}
