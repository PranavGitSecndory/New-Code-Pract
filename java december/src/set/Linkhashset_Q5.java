//Clear all elements from a LinkedHashSet.
package set;

import java.util.LinkedHashSet;

public class Linkhashset_Q5 {
public static void main(String[] args) {
	LinkedHashSet ob =new LinkedHashSet();
	ob.add(10);
	ob.add(87);
	ob.add(56);
	ob.add(4);
	System.out.println("linkhashset : "+ob);
	ob.clear();
	System.out.println("clear all elements : "+ob);
}
}
