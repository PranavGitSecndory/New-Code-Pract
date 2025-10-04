package Array_list;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Itreter {
public static void main(String[] args) {
	ArrayList ob =new ArrayList();
	ob.add(1);
	ob.add(2);
	ob.add(3);
	ob.add(4);
	ob.add(5);
	ob.add(6);
	
	ListIterator obb =ob.listIterator();
	while(obb.hasNext())
	{
		System.out.println(obb.next());
	}
	System.out.println("--------------------------------------");
	while(obb.hasPrevious())
	{
		System.out.println(obb.previous());
	}
	System.out.println(ob);
}
}
