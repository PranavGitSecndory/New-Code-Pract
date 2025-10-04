//3. Write a Java program to search for a key in a Tree Map.
package map;

import java.util.TreeMap;

public class Treemap_Q3 {
public static void main(String[] args) {
	TreeMap<String , Integer> ob=new TreeMap<String, Integer>();
	ob.put("Apple", 2);
	ob.put("mango", 1);
	ob.put("chiku", 3);
	ob.put("banana", 4);
	
	System.out.println(ob);
	
	String s="mango";
	
	if(ob.containsKey(s))
	{
		System.out.println(s+ ob.get(s));
	}
	else
	{
		System.out.println(s+" not found");
	}
}
}
