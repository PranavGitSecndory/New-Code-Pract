//Iterate through a LinkedHashSet using both
//for-each loop and iterator.
package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkhashset_Q6 {
public static void main(String[] args) {
	LinkedHashSet ob =new LinkedHashSet();
	ob.add(10);
	ob.add(87);
	ob.add(56);
	ob.add(4);
	System.out.println("linkhashset : "+ob);
	Iterator obb =ob.iterator();
	while(obb.hasNext())
	{
		System.out.print(obb.next()+" ");
	}
	System.out.println();
	for(Object n1 : ob)
	{
		System.out.print(n1+ " ");
	}
}
}
