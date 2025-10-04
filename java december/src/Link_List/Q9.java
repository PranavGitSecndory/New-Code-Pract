//9. Write a Java program to insert some 
//elements at the specified position into a linked list.
package Link_List;

import java.util.LinkedList;

class Link9
{
	void list()
	{
		LinkedList ob=new LinkedList();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		System.out.println("Before ADD :"+ob);
		ob.add(3, 3000);
		System.out.println("after add :"+ob);
	}
}
public class Q9 {
public static void main(String[] args) {
	Link9 ob=new Link9();
	ob.list();
}
}
