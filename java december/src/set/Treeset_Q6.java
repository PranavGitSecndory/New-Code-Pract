//6. Write a Java program to clone a tree set list
//to another tree set.
package set;

import java.util.TreeSet;

public class Treeset_Q6 {
public static void main(String[] args) {
	TreeSet ob =new TreeSet();

	ob.add(29);
	ob.add(69);
	ob.add(79);
	ob.add(49);
	System.out.println(ob);
	TreeSet ob1 =  (TreeSet)ob.clone();
	System.out.println("clont tree set : "+ob1);
}
}
