//4. Write a Java program to retrieve an element 
//(at a specified index) from a given array list.
package Array_list;

import java.util.ArrayList;

class ArrayList3
{
	void get()
	{
		ArrayList ob=new ArrayList();
	
		ob.add(1);
		ob.add(2);
		ob.add(3);
		System.out.println("list of number is"+ob);
		System.out.println("number at indev 2 is = "+ob.get(2));
		
		
	}
	}
public class Q4 {
public static void main(String[] args) {
	ArrayList3 ob=new ArrayList3();
	ob.get();
}
}
