//6. Write a Java program that demonstrates 
//the use of a finally block.  
package Exception;

public class Q6 {
	static void Question6()
	{
		int a[]= {1,2,3};
		try {
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("hello niks");
		}
	}
public static void main(String[] args) {
	Question6();
}
}
