package Practice;

public class PolyQ2{
	void computeaverage(int a, int b)
	{
		a+=b;
		int avj=a/2;
		System.out.println(avj +" = avrage of sum");
	}
	void computeaverage(int a, int b, int c)
	{
		c+=a+b;
		int avj= c/2;
		System.out.println(avj+" = avrage of num");
	}
	public static void main(String args[])
	{
		PolyQ2 ob=new PolyQ2();
		ob.computeaverage(10,20);
		ob.computeaverage(10,20,30);
	}
}
