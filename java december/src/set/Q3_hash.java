//3. Write a Java program to get the number of elements in a hash set.
package set;

import java.util.HashSet;

public class Q3_hash {
public static void main(String[] args) {
HashSet ob =new HashSet();
	
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(40);
	ob.add(50);
	System.out.println("Number of element is : "+ob.size());
}
}
