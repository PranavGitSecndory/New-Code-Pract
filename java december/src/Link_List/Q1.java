//
//1. Write a Java program to append the specified 
//element to the end of a linked list.
package Link_List;

import java.util.LinkedList;

class Link1
{
	void append()
	{
		LinkedList ob=new LinkedList();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		System.out.println("before linklist : "+ob);
		ob.add(3, 30);
		System.out.println("after linklist :"+ob);
	}
}
public class Q1 {
public static void main(String[] args) {
	Link1 ob=new Link1();
	ob.append();
}
}
