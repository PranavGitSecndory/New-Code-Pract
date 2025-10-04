//15. Handle multiple exceptions using separate catch
//blocks for different exception types.  
package Exception;

public class Throws_new_Q15 {
	static void print()
	{
		try {
		System.out.println(6/0);
		int a[]= {1,3,4};
		System.out.println(a[20]);
		}
		catch (ArithmeticException e)
		{
	            System.out.println(e);
	    } 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch (Exception e) 
		{
	            System.out.println(e);
	     }
	}
public static void main(String[] args) {
	print();
}
}
