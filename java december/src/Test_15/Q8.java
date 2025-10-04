//Write a Java program that catches an ArrayIndexOutOfBoundsException.
package Test_15;

public class Q8 {
	void outofbond()
	{
		int a[]= {1,2,3};
		try {
			System.out.println(a[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		}
	}
public static void main(String[] args) {
	Q8 ob=new Q8();
	ob.outofbond();
}
}
