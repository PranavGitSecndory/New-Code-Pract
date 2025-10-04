//2. Write a Java program to iterate through all
//elements in a hash list.
package set;

import java.util.HashSet;
import java.util.Iterator;

public class Q2_hash {
public static void main(String[] args) {
HashSet ob =new HashSet();
	
	ob.add(100);
	ob.add(200);
	ob.add(300);
	ob.add(400);
	ob.add(500);
	
	Iterator obb =ob.iterator();
	while(obb.hasNext())
	{
		System.out.println(obb.next());
	}
}
}
