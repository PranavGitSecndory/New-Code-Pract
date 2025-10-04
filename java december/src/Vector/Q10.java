//10. Write a Java program to check if a vector is empty or not.
package Vector;

import java.util.Vector;

public class Q10 {
public static void main(String[] args) {
Vector ob =new Vector();
	
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(40);
	ob.add(50);
	System.out.println(ob);
	
	System.out.println(ob.isEmpty());
	
}
}
