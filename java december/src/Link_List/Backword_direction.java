//Print the backwards directions of LinkedList
package Link_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Backword_direction {
public static void main(String[] args) {
LinkedList ob =new LinkedList(Arrays.asList(10,20,30,40,50));
	
	ListIterator obb= ob.listIterator();
	while(obb.hasNext())
	{
	obb.next();
	}
	while(obb.hasPrevious())
	{
		System.out.println(obb.previous());
	}
}
}
