//5. Write a Java program to update an array


//element by the given element.
package Array_list;

import java.util.ArrayList;

class ArrayList4
{
	void update()
	{
		ArrayList ob=new ArrayList();
	
		ob.add(1);
		ob.add(2);
		ob.add(3);
		System.out.println("list of number is"+ob);
		ob.set(1,9);
		System.out.println("agter updeting number "+ob);
		
		
	}
	}
public class Q5 {
public static void main(String[] args) {
	ArrayList4 ob=new ArrayList4();
	ob.update();
}
}
