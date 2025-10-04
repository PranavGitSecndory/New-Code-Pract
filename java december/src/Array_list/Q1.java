//1.Write a Java program to create an array list,
//add some colors (strings) and print out the collection.
package Array_list;

import java.util.ArrayList;

class Arraylist1
{
	void print()
	{
		ArrayList obb=new ArrayList();
		obb.add("red");
		obb.add("blie");
		obb.add("black");
		obb.add("pink");
		
		System.out.println("list of colour is = "+obb);
	}
}
public class Q1 {
public static void main(String[] args) {
	Arraylist1 ob=new Arraylist1();
	ob.print();
}
}
