package hash;

import java.util.Hashtable;

public class Hashtable_demo {
public static void main(String[] args) {
	Hashtable< Integer,String> ob =new Hashtable();
	
	ob.put( 22,"Apple");
	ob.put(9,"lichi" );
	ob.put(32,"mango" );
	ob.put( 36,"chiku");
	ob.put( 29,"banana");
	System.out.println("hash teble is : "+ob);
	

	System.out.println(	ob.containsValue("Apple"));
	
	System.out.println("HAsah teble is empty or not : "+ob.isEmpty());
	
	ob.remove(22);
	System.out.println("After remove the element 22 : "+ob);
	
	System.out.println("Size of hash table : "+ob.size());
}
}
