//2. Write a Java program to copy Tree Map's 
//content to another Tree Map.
package map;

import java.util.TreeMap;

public class Treemap_Q2 {
public static void main(String[] args) {
	TreeMap<String , Integer> ob=new TreeMap<String, Integer>();
	ob.put("Apple", 2);
	ob.put("mango", 1);
	ob.put("chiku", 3);
	ob.put("banana", 4);
	
	TreeMap<String , Integer>  ob1= new TreeMap<String, Integer>(ob);
	System.out.println(ob1);
}
}
