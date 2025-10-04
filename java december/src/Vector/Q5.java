//5. Write a program to check if a specific element 
//exists in a vector.
package Vector;

import java.util.Vector;

public class Q5 {
	public static void main(String[] args) {
		Vector ob =new Vector();
		
		ob.add(10);
		ob.add(20);
		ob.add(30);
		
		ob.contains(20);
		System.out.println(ob.contains(20));
	}
}
