//9. Create a program to remove all elements 
//from a vector using the clear() method.
package Vector;

import java.util.Vector;

public class Q9 {
public static void main(String[] args) {
	Vector ob =new Vector();
	
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(40);
	ob.add(50);
	System.out.println(ob);
	
	ob.clear();
	System.out.println(ob);
}
}
