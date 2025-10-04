package set;

import java.util.TreeSet;

public class Tree_set {
public static void main(String[] args) {
	TreeSet ob =new TreeSet();
	
	ob.add(60);
	ob.add(50);
	ob.add(65);
	ob.add(55);
	ob.add(45);
	ob.add(35);
	ob.add(75);
	ob.add(85);
	
	System.out.println("Tree set : "+ob);
	
	System.out.println("celling method :"+ob.ceiling(65));
	System.out.println("floor method :"+ob.floor(60));
	System.out.println("higher method :"+ob.higher(55));
	System.out.println("lower method :"+ob.lower(60));
	System.out.println("hasesat method :"+ob.headSet(65));
	System.out.println("tailset method :"+ob.tailSet(55));
	
}
}
