//Check if a specific element exists in a LinkedHashSet.
package set;

import java.util.LinkedHashSet;

public class Linkhashset_Q3 {
public static void main(String[] args) {
	LinkedHashSet ob =new LinkedHashSet();
	ob.add(10);
	ob.add(87);
	ob.add(56);
	ob.add(4);
	System.out.println("linkhashset : "+ob);
	
	System.out.println("element exist in that : "+ob.contains(10));
}
}
