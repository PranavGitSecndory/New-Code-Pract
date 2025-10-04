//9. Write a Java program to find numbers less than 7 in a tree set.
package set;

import java.util.TreeSet;

public class Treeset_Q9 {
public static void main(String[] args) {
	TreeSet ob =new TreeSet();
	ob.add(29);
	ob.add(6);
	ob.add(7);
	ob.add(49);
	System.out.println("set is : "+ob);
	
	System.out.println("number less then 7 : "+ob.lower(7));
	
}
}
