//4. Write a Java program to create a reverse order view 
//of the elements contained in a given tree set.
package set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_Q4 {
public static void main(String[] args) {
	TreeSet ob =new TreeSet();

	ob.add(29);
	ob.add(69);
	ob.add(79);
	ob.add(49);
	
	Iterator obb= ob.descendingIterator();
	while(obb.hasNext())
	{
		System.out.println(obb.next());
	}
}
}
