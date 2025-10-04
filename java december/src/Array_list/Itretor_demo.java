package Array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Itretor_demo {
public static void main(String[] args) {
	ArrayList ob=new ArrayList();
	ob.add(1);
	ob.add(2);
	ob.add(3);
	ob.add(4);
	ob.add(5);
	ob.add(6);
	
	Iterator obj= ob.iterator();
	while(obj.hasNext())
	{
		System.out.println(obj.next());
	}
	System.out.println(ob);
}
}
