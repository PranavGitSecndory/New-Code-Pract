//5. Write a Java program to insert the specified 
//element at the specified position in the linked list.
package Link_List;

import java.util.LinkedList;

class Link5
{
	void list()
	{
		LinkedList ob=new LinkedList();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		
		ob.add(2, 200);
		System.out.println(ob);
	}
	
}
public class Q5 {
public static void main(String[] args) {
	Link5 ob=new Link5();
	ob.list();
			
}
}
