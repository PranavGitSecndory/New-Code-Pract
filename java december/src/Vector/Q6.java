//6. Implement a Java program to retrieve the first 
//and last elements from a vector.
package Vector;

import java.util.Vector;

public class Q6 {
	public static void main(String[] args) {
		Vector ob =new Vector();
		
		ob.add(10);
		ob.add(20);
		ob.add(30);
		
		
		System.out.println(ob.firstElement());
		System.out.println(ob.lastElement());
		
	}
}
