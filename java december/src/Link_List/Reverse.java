//Reverse the LinkedList all elements 
package Link_List;

import java.util.Collections;
import java.util.LinkedList;

public class Reverse {
public static void main(String[] args) {
	LinkedList ob =new LinkedList();
	
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(40);
	ob.add(50);
	System.out.println("before revers :"+ob);
	Collections.reverse(ob);
	System.out.println("After revers : "+ob);
}
}
