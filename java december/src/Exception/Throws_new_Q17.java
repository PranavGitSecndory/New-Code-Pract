//17. Create a method that throws IllegalArgumentException 
//when a negative number is passed as an argument.  
package Exception;
public class Throws_new_Q17 {
	static void print(int a)
	{
		if(a<0)
		{
			throw new IllegalArgumentException("no is negative");
		}
		System.out.println(a);
	}
public static void main(String[] args)
{
	print(4);
	print(-1);
}
}
