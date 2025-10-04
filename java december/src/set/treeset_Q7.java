//7. Write a Java program to get the number of elements in a tree set.
package set;

import java.util.TreeSet;

public class treeset_Q7 {
public static void main(String[] args) {
	TreeSet ob =new TreeSet();

	ob.add(29);
	ob.add(69);
	ob.add(79);
	ob.add(49);
	System.out.println(ob);
	
	System.out.println("Size of tree set :"+ob.size());
}
}
