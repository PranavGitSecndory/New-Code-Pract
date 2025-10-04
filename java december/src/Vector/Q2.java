//2. Implement a Java program to iterate through all 
//elements in a vector using an iterator.
package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Q2 {
public static void main(String[] args) {
	Vector ob =new Vector();
	
	ob.add(10);
	ob.add(20);
	ob.add(30);
	
	Iterator obb =ob.iterator();
	System.out.println("element are");
	while(obb.hasNext())
	{
		System.out.println(obb.next());
	}
}
}
