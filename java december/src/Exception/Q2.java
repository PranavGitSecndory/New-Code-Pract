//2. Write a Java program to handle an array 
// 	 index out-of-bounds exception.  
package Exception;

public class Q2 {
	void Quetion2()
	{
		int a[]= {1,2,3,4};
		try
		{
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Q2 ob=new Q2();
	ob.Quetion2();
}
}
