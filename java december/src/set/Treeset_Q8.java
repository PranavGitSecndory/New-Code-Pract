//8. Write a Java program to compare two tree sets.
package set;

import java.util.TreeSet;

public class Treeset_Q8 {
public static void main(String[] args) {
	TreeSet ob =new TreeSet();
	ob.add(29);
	ob.add(69);
	ob.add(79);
	ob.add(49);
	System.out.println("set 1"+ob);
	
	TreeSet ob1 =new TreeSet();
	ob1.add(29);
	ob1.add(69);
	ob1.add(79);
	ob1.add(49);
	System.out.println("set 2"+ob1);
	
	System.out.println("Both set are equals :"+ob.equals(ob1));
}
}
