//4. Create a Java program to remove an element from a 
//vector by its index.
package Vector;

import java.util.Vector;

public class Q4 {
	public static void main(String[] args) {
		Vector ob =new Vector();
		
		ob.add(10);
		ob.add(20);
		ob.add(30);
		
		ob.remove(2);
		System.out.println(ob);
	}
}
