//10. Write a Java program to shuffle elements in an array list.

package Array_list;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList10
{
	void suffle()
	{
		ArrayList ob=new ArrayList();
	
		ob.add(1);
		ob.add(2);
		ob.add(3);
		System.out.println("before the suffle number is"+ob);
		Collections.shuffle(ob);
		System.out.println("after suffle   element "+ob);
		
		
	}
	}
public class Q10 {
	public static void main(String[] args) {
		
	
	ArrayList10 ob =new ArrayList10();
	ob.suffle();
}
}
