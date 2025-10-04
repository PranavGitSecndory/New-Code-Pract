//6. Write a Java program to remove the third 
//element from an array list.
package Array_list;

import java.util.ArrayList;

class ArrayList6
{
	void remove()
	{
		ArrayList ob=new ArrayList();
	
		ob.add(1);
		ob.add(2);
		ob.add(3);
		System.out.println("list of number is"+ob);
		ob.remove(2);
		System.out.println("remove 2nd  element "+ob);
		
		
	}
	}
public class Q6 {
public static void main(String[] args) {
	ArrayList6 ob=new ArrayList6();
	ob.remove();
}
}
