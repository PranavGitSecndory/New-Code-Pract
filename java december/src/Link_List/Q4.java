//4. Write a Java program to iterate a linked list in reverse order.
package Link_List;

import java.util.Iterator;
import java.util.LinkedList;

class Link4
{
	void list()
	{
		LinkedList ob=new LinkedList();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		
		Iterator obb= ob.descendingIterator();
		while(obb.hasNext())
		{
			System.out.println(obb.next());
		}
	}
}
public class Q4 {
public static void main(String[] args) {
	Link4 ob=new Link4();
	ob.list();
}
}
