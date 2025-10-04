//
//8. Write a Java program to insert the specified 
//element at the end of a linked list.
package Link_List;

import java.util.LinkedList;

class Link8
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
		
		ob.addLast(1000);
		System.out.println("After adding :"+ob);
	}
}
public class Q8 {
public static void main(String[] args) {
	Link8 ob=new Link8();
	ob.list();
}
}

