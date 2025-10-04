//
//8. Write a Java program to get a key-value mapping
//associated with the greatest key and the least key in a map.
package map;

import java.util.TreeMap;

public class Treemap_Q8 {
public static void main(String[] args) {
	TreeMap<String , Integer> ob=new TreeMap<String, Integer>();
	ob.put("Apple", 2);
	ob.put("mango", 1);
	ob.put("chiku", 3);
	ob.put("banana", 4);
	
	System.out.println(ob);
	
System.out.println("greter key : "+ob.lastKey());
System.out.println("small key :"+ob.firstKey());
}
}
