//
//2. Write a Java program to iterate through 
//all elements in an array list.
package Array_list;

import java.util.ArrayList;
class Arraylist
{
	 void print()
	{
		ArrayList ob=new ArrayList();
		ob.add("red");
		ob.add("blue");
		ob.add("black");
		ob.add("pink");
		
		System.out.println("list of colour is ");
		for(int i=0; i<ob.size(); i++)
		{
			System.out.println(ob.get(i));
		}
		
	}
}
public class Q2 {
public static void main(String[] args) {
	Arraylist ob=new Arraylist();
	ob.print();
}
}
