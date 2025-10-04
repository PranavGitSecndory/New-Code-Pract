//18. Write a program that throws NullPointerException 
//manually when a null reference is accessed.  
package Exception;

public class Throws_new_Q18 {
	static void print(String s)
	{
		
		if(s==null)
		{
		throw new NullPointerException("Null value not allow");
		}
		System.out.println(s.length());
		
	}
public static void main(String[] args) {
	print("sagar");
	print(null);
}
}
