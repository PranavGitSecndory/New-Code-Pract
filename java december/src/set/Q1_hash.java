//1. Write a Java program to append the specified element to
//the end of a hash set.
package set;

import java.util.HashSet;

public class Q1_hash {
public static void main(String[] args) {
	HashSet ob =new HashSet();
	
	ob.add(10);
	ob.add(11);
	ob.add(12);
	ob.add(13);
	ob.add(14);
	
	System.out.println("hash set Befor add :"+ob);
	ob.add(15);
	System.out.println("after Add at last :"+ob);
}
}
