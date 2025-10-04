package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Treemap_Q10 {
public static void main(String[] args) {
	TreeMap<String , Integer> ob=new TreeMap<String, Integer>();
	ob.put("Apple", 2);
	ob.put("mango", 1);
	ob.put("chiku", 3);
	ob.put("banana", 4);
	
	List<String> ob1 =new ArrayList<String>(ob.keySet());
	System.out.println(ob1);
	Collections.reverse(ob1);
	System.out.println(ob1);
}
}
