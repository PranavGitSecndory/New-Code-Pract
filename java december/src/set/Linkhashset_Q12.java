//Merge two LinkedHashSets into a third set and 
//display the result without duplicates.
package set;

import java.util.LinkedHashSet;

public class Linkhashset_Q12 {
	public static void main(String[] args) {
		LinkedHashSet ob =new LinkedHashSet();
		ob.add(10);
		ob.add(87);
		ob.add(56);
		ob.add(4);
		
		LinkedHashSet ob1 =new LinkedHashSet();
		ob1.add(101);
		ob1.add(null);
		ob.add(4);
		
		LinkedHashSet ob2 =new LinkedHashSet();
		ob2.add(ob);
		ob2.add(ob1);
	
		
		System.out.println(ob2);
	}

}
