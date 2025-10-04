//1. Write a Java program to handle an arithmetic
//exception when dividing a number by zero.  
package Exception;

public class Q1 {
	public static void main(String[] args) {
		System.out.println(10);
		try {
			System.out.println(20/0);
		}
		catch(ArithmeticException  w)
		{
			System.out.println(w+" Arithmetic exception");
		}
		System.out.println("hello nick");
		
	}

}
