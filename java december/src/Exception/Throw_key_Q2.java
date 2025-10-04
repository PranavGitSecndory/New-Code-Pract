//2. Create a program to handle ArrayIndexOutOfBoundsException 
// when accessing an invalid index of an array.  
package Exception;

public class Throw_key_Q2 {
	static void print()
	{
		int a[]= {1,2,3};
		try {
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	print();
}
}
