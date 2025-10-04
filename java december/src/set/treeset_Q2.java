//2. Write a Java program to iterate through all 
//elements in a tree set.
package set;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset_Q2 {
public static void main(String[] args) {
	TreeSet ob =new TreeSet();
	
	ob.add(29);
	ob.add(69);
	ob.add(79);
	ob.add(49);
	ob.add(99);
	
	Iterator obb= ob.iterator();
	while(obb.hasNext())
	{
		System.out.println(obb.next());
	}
}
}
