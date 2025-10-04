//11. Write a Java program to get a key-value 
//mapping associated with the greatest key less than
//or equal to the given key.
//
//12. Write a Java program to get the greatest 
//key less than or equal to the given key.
package map;

import java.util.Map;
import java.util.TreeMap;

public class Treemap_Q11_Q12 {
public static void main(String[] args) {
	TreeMap<String , Integer> ob=new TreeMap<String, Integer>();
	ob.put("Apple", 2);
	ob.put("mango", 1);
	ob.put("chiku", 3);
	ob.put("banana", 4);
	String Key = "Chick";
	Map.Entry<String, Integer> entry =ob.floorEntry(Key);
	if(entry != null)
	{
		System.out.println("key map Flor entry : "+entry.getKey()+" "+entry.getValue());
	}
	
	
		System.out.println("Great key low or equal : "+ob.floorKey(Key));
	
}
}
