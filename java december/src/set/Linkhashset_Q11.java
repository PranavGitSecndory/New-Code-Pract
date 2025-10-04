package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Linkhashset_Q11 {
public static void main(String[] args) {
	LinkedHashSet ob =new LinkedHashSet();
	ob.add(10);
	ob.add(87);
	ob.add(56);
	ob.add(4);
	
	List obb = new ArrayList(ob);
	System.out.println(obb);
	Collections.sort(obb);
	System.out.println(obb);
}
}
