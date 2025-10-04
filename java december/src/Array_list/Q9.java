//9. Write a Java program to copy one array list into another.
package Array_list;

import java.util.ArrayList;

class ArrayList9
{
	void copy()
	{
		ArrayList ob=new ArrayList();
	
		ob.add(1);
		ob.add(2);
		ob.add(3);
		System.out.println("list of firest object is :"+ob);
		ArrayList ob1=new ArrayList();
		ob1.add(4);
		ob1.add(5);
		ob1.add(6);
		System.out.println("list of second ob is :"+ob1);
		ob.addAll(ob1);
		System.out.println("add all ob in one is : "+ob);
		
		
		
		
		
	}
	}
public class Q9 {
	public static void main(String[] args) {
		
	
	ArrayList9 ob=new ArrayList9();
	ob.copy();
	}
}
