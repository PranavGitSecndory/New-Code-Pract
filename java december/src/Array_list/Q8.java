//8. Write a Java program to sort a given array list.
package Array_list;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList8
{
	 void sort()
	{
		 ArrayList ob=new ArrayList();
		 ob.add(3);
			ob.add(1);
			ob.add(2);
		System.out.println("list of number is"+ob);
		Collections.sort(ob);
		System.out.println("after sort arrylist : "+ob);
	}
}
public class Q8 {
public static void main(String[] args) {
	ArrayList8 ob=new ArrayList8();
	ob.sort();
}
}
