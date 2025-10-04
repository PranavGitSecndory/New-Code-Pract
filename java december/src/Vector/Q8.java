//8. Write a program to find the index of a specific 
//element in a vector.
package Vector;

import java.util.Vector;

public class Q8 {
public static void main(String[] args) {
	Vector ob =new Vector();
	
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(40);
	ob.add(50);
	System.out.println(ob);
	
	
	System.out.println(ob.indexOf(20));
}
}
