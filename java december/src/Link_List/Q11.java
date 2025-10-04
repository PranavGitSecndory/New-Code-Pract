//11. Write a Java program to display elements and their 
//positions in a linked list.
package Link_List;

import java.util.LinkedList;

class Link11
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
		ob.add(2, 2000);
		System.out.println("after add :"+ob);
	}
}
public class Q11 {
public static void main(String[] args) {
	Link10 ob=new Link10();
	ob.list();
}
}
