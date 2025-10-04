//10. Write a Java program to get the element in a tree 
//set which is greater than or equal to the given element.
//
//11. Write a Java program to get the element
//in a tree set less than or
//equal to the given element.
//
//12. Write a Java program to get the element in a tree
//set strictly greater than or equal to the given element.
//
//13. Write a Java program to get an element in a tree
//set that has a lower value than the given elemen
package set;

import java.util.TreeSet;

public class treeset_Q10 {
public static void main(String[] args) {
	
		TreeSet ob =new TreeSet();
		ob.add(29);
		ob.add(6);
		ob.add(69);
		ob.add(79);
		ob.add(7);
		ob.add(49);
		System.out.println("set is : "+ob);
		
		System.out.println("celling : "+ob.ceiling(69));
		
		System.out.println("floor : "+ob.floor(7));
		
		System.out.println("higher :"+ob.higher(89));
		
		System.out.println("lower : "+ob.lower(49));
}
}
