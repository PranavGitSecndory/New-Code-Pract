//9. Write a Java program to get the first (lowest) key 
//and the last (highest) key currently in a map.
package map;

import java.util.TreeMap;

public class Treemap_Q9 {
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
