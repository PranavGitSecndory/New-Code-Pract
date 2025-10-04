//Demonstrate try, catch, finally block with division operation
//where denominator could be zero.
package Test_15;

public class Q10 {
	 void divide(int a, int b)
	 {
	        try 
	        {
	            int result = a / b;
	            System.out.println("Result = " + result);
	        } 
	        catch (ArithmeticException e)
	        {
	            System.out.println(e);
	        } 
	        finally
	        {
	            System.out.println("Finally block executed.");
	        }
	    }
	 public static void main(String[] args) {
		 Q10 ob = new Q10();

	        ob.divide(10, 2);
	        System.out.println("--------------------------------");
	        ob.divide(10, 0);
	}
}
