package constuctor;

public class MathOperators {
	void multiply(int a,int b)
	{
		System.out.println("call two int method");
	}
	void multiply(int a,int b,int c)
	{
		System.out.println("call three int method");
	}
	void multiply(double a,double b)
	{
		System.out.println("call two double method");
	}
public static void main(String[] args) {
	MathOperators ob=new MathOperators();
	ob.multiply(10, 20);
	ob.multiply(100, 200,300);
	ob.multiply(10.25, 20.25);
}
}
