//
//5. Write a Java program to get the first and last 
//elements in a tree set.
package set;

import java.util.TreeSet;

public class Treeset_Q5 {
public static void main(String[] args) {
	TreeSet ob =new TreeSet();

	ob.add(29);
	ob.add(69);
	ob.add(79);
	ob.add(49);
	System.out.println(ob);
	
	
	System.out.println("first element :"+ob.getFirst());
	System.out.println("last element : "+ob.getLast());
}
}
