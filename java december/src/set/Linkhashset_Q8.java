//
//Add elements from an array into a LinkedHashSet 
//and print the set.
package set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Linkhashset_Q8 {
public static void main(String[] args) {
	Integer a []= {1,2,3,4,5};
	LinkedHashSet ob =new LinkedHashSet();
	
	for(int num : a)
	{
		ob.add(num);
		
	}
	System.out.println(ob);
	LinkedHashSet ob1 =new LinkedHashSet(Arrays.asList(a));
	System.out.println(ob);
}
}
