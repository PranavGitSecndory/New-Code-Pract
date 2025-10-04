package set;

import java.util.LinkedHashSet;

public class Linkhashset_demo {
public static void main(String[] args) {
	LinkedHashSet ob =new LinkedHashSet();
	ob.add(10);
	ob.add(87);
	ob.add(56);
	ob.add(4);
	System.out.println("link hash set : "+ob);
	
	ob.addFirst(20);
	System.out.println("add first :"+ob);
	
	ob.addLast(100);
	System.out.println("add last : "+ob);
	 
}
}
