//
//2. Write a Java program to iterate through 
//all elements in a linked list.
package Link_List;

import java.util.Iterator;
import java.util.LinkedList;

class Link2
{
	void list()
	{
		LinkedList ob=new LinkedList();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		
		 Iterator obb=ob.iterator();
		 
		 while(obb.hasNext())
		 {
			 System.out.println(obb.next());
		 }
	}
}
public class Q2 {
public static void main(String[] args) {
	Link2 ob=new Link2();
	ob.list();
			

			
}
}
