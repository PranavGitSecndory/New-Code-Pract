//6. Write a Java program to clone a hash set to another hash set.

package set;

import java.util.HashSet;

public class Q6_hash {
public static void main(String[] args) {
HashSet ob =new HashSet();

	
	ob.add(10);
	ob.add(11);
	ob.add(12);
	ob.add(13);
	ob.add(14);
	System.out.println(ob);
	
	HashSet ob1 =(HashSet)ob.clone();
	System.out.println("new set : "+ob1);
	
	
}
}
