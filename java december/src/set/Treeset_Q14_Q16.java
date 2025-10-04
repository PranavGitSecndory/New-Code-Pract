//14. Write a Java program to retrieve and remove the
//first element of a tree set.
//
//15. Write a Java program to retrieve and remove the
//last element of a tree set.
//
//16. Write a Java program to remove a given element 
//from a tree set.
package set;

import java.util.TreeSet;

public class Treeset_Q14_Q16 {
public static void main(String[] args) {

	TreeSet ob =new TreeSet();
	ob.add(29);
	ob.add(6);
	ob.add(69);
	ob.add(79);
	ob.add(7);
	ob.add(49);
	System.out.println("set is : "+ob);
	
	System.out.println("first element remove : "+ob.removeFirst());
	System.out.println(ob);
	
	System.out.println("Last element remob=ve :"+ob.removeLast());
	System.out.println(ob);
	
	System.out.println("remove pareticuler given element :"+ob.remove(69));
System.out.println(ob);
}
}
