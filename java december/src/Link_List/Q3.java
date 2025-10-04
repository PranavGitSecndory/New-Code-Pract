//3. Write a Java program to iterate through 
//all elements in a linked list starting at the specified position.
package Link_List;

import java.util.Iterator;
import java.util.LinkedList;

class Link3
{
	void list()
	{
		LinkedList ob=new LinkedList();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		
		ob.addFirst(00);
		 Iterator obb=ob.iterator();
		 while(obb.hasNext())
		 {
			 System.out.println(obb.next());
		 }
	}
}
public class Q3 {
public static void main(String[] args) {
	Link3 ob=new Link3();
	ob.list();
}
}
