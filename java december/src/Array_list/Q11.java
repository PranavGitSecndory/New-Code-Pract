
//11. Write a Java program to reverse elements in an array list.
package Array_list;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList11
{
	void reverse()
	{
		ArrayList ob=new ArrayList();
	
		ob.add(1);
		ob.add(2);
		ob.add(3);
		System.out.println("before the reverse is"+ob);
		Collections.reverse(ob);
		System.out.println("after the reverse element "+ob);
		
		
	}
	}
public class Q11 {
public static void main(String[] args) {
	ArrayList11 ob=new ArrayList11();
	ob.reverse();
}
}
