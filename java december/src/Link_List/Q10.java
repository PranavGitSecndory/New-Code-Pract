//10. Write a Java program to get the first and
//last occurrence of the specified elements in a linked list.
package Link_List;

import java.util.LinkedList;

class Link10
{
	void list()
	{
		LinkedList ob=new LinkedList();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		System.out.println("Before add :"+ob);
		ob.addFirst(1000);
		ob.addLast(5000);
		System.out.println("After adding :"+ob);
	}
}
public class Q10 {
public static void main(String[] args) {
	Link10 ob=new Link10();
	ob.list();
}
}
