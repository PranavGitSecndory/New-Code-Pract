
//4. Write a Java program to empty an hash set.
package set;

import java.util.HashSet;

public class Q4_hash {
public static void main(String[] args) {
HashSet ob =new HashSet();
	
	ob.add(10);
	ob.add(11);
	ob.add(12);
	ob.add(13);
	ob.add(14);
	
	System.out.println("hash set  :"+ob);
	ob.clear();
	System.out.println("Empty hash set : "+ob);
}
}
