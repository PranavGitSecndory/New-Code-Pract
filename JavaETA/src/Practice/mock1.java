package Practice;
abstract class constants
{
	static final double pi=3.14;
	abstract void calarea();
}

class circle extends constants
{
	void calarea()
	{
		int r=5;
		System.out.println("Area of circle is : "+(pi*r*r));
	}
}
public class mock1 {
	


	public static void main(String[] args) 
	{
		constants ob=new circle();
		ob.calarea();
	}
}


