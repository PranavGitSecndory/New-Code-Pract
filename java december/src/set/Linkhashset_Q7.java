//Create a LinkedHashSet and prevent duplicate values
//from being inserted. Show with an example.
package set;

import java.util.LinkedHashSet;

public class Linkhashset_Q7 {
public static void main(String[] args) {
	LinkedHashSet ob =new LinkedHashSet();
	ob.add(10);
	ob.add(87);
	ob.add(56);
	ob.add(4);
	ob.add(24);
	ob.add(null);
	ob.add(42);
	System.out.println("linkhashset : "+ob);
}
}
