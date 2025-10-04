//6. Write a Java program to insert elements
//into the linked list at the first and last positions.
package Link_List;

import java.util.LinkedList;

class Link6
{
	void list()
	{
		LinkedList ob=new LinkedList();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		
		ob.addFirst(1000);
		ob.addLast(5000);
		System.out.println(ob);
	}
}
public class Q6 {
public static void main(String[] args) {
	Link6 ob=new Link6();
	ob.list();
}
}
