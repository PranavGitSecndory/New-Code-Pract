//10. Create a program that handles an exception 
//inside a nested try-catch block.  

package Exception;

public class Throw_new_Q10 {
	static void print()
	{
		
		try {
			try {
				String s="nick";
				System.out.println(s.charAt(20));
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	print();
}
}
