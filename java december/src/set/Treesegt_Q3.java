//
//3. Write a Java program to add all the elements of a 
//specified tree set to another tree set.
package set;

import java.util.TreeSet;

public class Treesegt_Q3 {
	public static void main(String[] args) {
		TreeSet ob =new TreeSet();

		ob.add(29);
		ob.add(69);
		ob.add(79);
		ob.add(49);
		System.out.println("Before add :" +ob);
		
		TreeSet ob1 =new TreeSet();

		ob1.add(9);
		ob1.add(6);
		ob1.add(7);
		
		ob.addAll(ob1);
		System.out.println("After add all :"+ob);
	}

}