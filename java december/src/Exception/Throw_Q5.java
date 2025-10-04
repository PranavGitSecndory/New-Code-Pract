//5. Throw ArrayIndexOutOfBoundsException for an invalid array index.  
package Exception;

public class Throw_Q5 {
	static void Question5()
	{
		int a[]= {1,2,3,4};
		if(a.length<0)
		{
			throw new ArrayIndexOutOfBoundsException("Array lenth is greter");
		}
		System.out.println(a[12]);
	}
public static void main(String[] args) {
	Question5();
}
}
