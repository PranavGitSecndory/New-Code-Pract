package set;

import java.util.HashSet;
import java.util.Set;

public class Set_demo {
public static void main(String[] args) {
	Set set =new HashSet();
	
	set.add(10);
	set.add(110);
	set.add(40);
	set.add(45);
	set.add(76);
	System.out.println(set);
	set.remove(45);
	System.out.println("Remove after :"+set);
	set.addAll(set);
	System.out.println("addall sed :"+set);

	System.out.println("contain set element : "+	set.contains(40));
}
}
