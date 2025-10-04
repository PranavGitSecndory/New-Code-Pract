package Exception;

public class throw_Keyword {
	void print() throws ArithmeticException 
	{
		System.out.println(5/0);
	}
	void m1()
	{
		try {
			print();
		}
		catch(ArithmeticException e)
		{
			System.out.println("print method for throws exeption");
		}
	}
public static void main(String[] args) {
	throw_Keyword ob =new throw_Keyword();
	ob.m1();
}
}
