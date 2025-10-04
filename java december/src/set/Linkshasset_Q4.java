
//Remove an element from a LinkedHashSet and display the result.
package set;

import java.util.LinkedHashSet;

public class Linkshasset_Q4 {
public static void main(String[] args) {
	LinkedHashSet ob =new LinkedHashSet();
	ob.add(10);
	ob.add(87);
	ob.add(56);
	ob.add(4);
	System.out.println("linkhashset : "+ob);
	
	ob.remove(87);
	System.out.println("After remove  : "+ob);
}
}
