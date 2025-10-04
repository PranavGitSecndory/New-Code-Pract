//3. Write a Java program to insert an element at a specific
//position in a vector.
package Vector;

import java.util.Vector;

public class Q3 {
	public static void main(String[] args) {
		Vector ob =new Vector();
		
		ob.add(10);
		ob.add(20);
		ob.add(30);
	
		System.out.println(ob);
		
		ob.add(2,200);
		System.out.println(ob);
}
}
