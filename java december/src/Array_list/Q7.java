//7. Write a Java program to search for an element in an array list.
package Array_list;

import java.util.ArrayList;

class ArrayList7
{
	void search()
	{
		ArrayList ob=new ArrayList();
	
		ob.add(1);
		ob.add(2);
		ob.add(3);
		System.out.println("list of number is"+ob);
		
		
		System.out.println("search number 2 is present : "+ob.contains(2));
		
		
	}
	}
public class Q7 {
public static void main(String[] args) {
	ArrayList7 ob=new ArrayList7();
	ob.search();
}
}
