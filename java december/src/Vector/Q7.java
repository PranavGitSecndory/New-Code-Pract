//7. Write a Java program to update an element in a 
//vector at a specific index.
package Vector;

import java.util.Vector;

public class Q7 {
public static void main(String[] args) {
	
		Vector ob =new Vector();
		
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		System.out.println(ob);
		
		
		ob.setElementAt(2000, 2);
		System.out.println(ob);
		
	
		
		
}
}
