package Vector;

import java.util.Vector;

public class Vector_Demo {
public static void main(String[] args) {
	Vector ob =new Vector();
	
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(40);
	ob.add(50);
	System.out.println(ob);
	
	ob.addAll(ob);
	System.out.println(ob);
	
	ob.addElement(10);
	System.out.println(ob);
	
	System.out.println(ob.capacity());
	

	
	System.out.println(ob.contains(5));
	
	
	ob.clear();
	System.out.println(ob);
	
	
	}
}
