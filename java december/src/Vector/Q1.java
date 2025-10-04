//1. Write a Java program to create a vector and add elements to it.
package Vector;

import java.util.Vector;

public class Q1 {
	public static void main(String[] args) {
		Vector ob =new Vector();
		
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.addElement(40);
		ob.addElement(50);
		System.out.println(ob);
}
}
