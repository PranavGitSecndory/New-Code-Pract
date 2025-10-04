//12. Write a program to convert a vector into an array.
package Vector;

import java.util.Arrays;
import java.util.Vector;

public class Q12 {
public static void main(String[] args) {
Vector ob =new Vector();
	
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(40);
	ob.add(50);
	System.out.println(ob);
	
	 Object[] arr = ob.toArray();
     
     
     System.out.println("Array: " + Arrays.toString(arr));
}
}
