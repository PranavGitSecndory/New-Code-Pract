
//7. Write a Java program to convert a hash set to an array.
package set;

import java.util.HashSet;

public class Q7_hash {
public static void main(String[] args) {
HashSet<Integer> ob =new HashSet();

	
	ob.add(10);
	ob.add(11);
	ob.add(12);
	ob.add(13);
	ob.add(14);
	System.out.println(ob);
	
	Integer a[]= new Integer[ob.size()];
	ob.toArray(a);
	
	System.out.println("hash set to array");
	for(Integer i : a)
	{
		System.out.println(i);
	}
}
}
