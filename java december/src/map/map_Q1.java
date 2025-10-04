//1. Write a Java program to associate the specified 
//value with the specified key in a HashMap.
package map;

import java.util.HashMap;
import java.util.Map;

public class map_Q1 {
	  public static void main(String[] args) {
	        
	        Map<Integer, String> map = new HashMap<>();

	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Cherry");

	     
	        System.out.println("HashMap contents: " + map);
	        System.out.println("Size : "+map.size());
	    }
}
