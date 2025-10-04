//1. Write a Java program to associate the specified 
//value with the specified key in a Tree Map.
package map;

import java.util.TreeMap;

public class Treemap_Q1 {
public static void main(String[] args) {
	TreeMap<String , Integer> ob=new TreeMap<String, Integer>();
	ob.put("java", 2);
	ob.put("python", 1);
	ob.put("html", 3);
	
	System.out.println(ob);
}
}
