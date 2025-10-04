//1. Write a Java program to create a tree set, add 
//some colors (strings) and print out the tree set.
package set;

import java.util.TreeSet;

public class Treeset_Q1 {
public static void main(String[] args) {
	TreeSet ob =new TreeSet();
	
	ob.add("blue");
	ob.add("black");
	ob.add("red");
	ob.add("yellow");
	
	System.out.println(ob);
}
}
