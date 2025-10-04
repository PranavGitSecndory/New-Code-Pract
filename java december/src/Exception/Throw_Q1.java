//1. Throw ArithmeticException for division by zero.  
package Exception;

public class Throw_Q1 {
	static void Question1()
	{
		int a=10;
		int b=0;
		if(a==0)
		{
			throw new ArithmeticException ("valu not devide by zero");
		}
		int num=a/b;
		System.out.println(num);
	}
public static void main(String[] args) {
	Question1();
}
}
