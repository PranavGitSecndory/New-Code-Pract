package map;

import java.util.TreeMap;

public class Treemap {
public static void main(String[] args) {
	TreeMap<String , Integer> ob=new TreeMap<String, Integer>();
	ob.put("Apple", 2);
	ob.put("mango", 1);
	ob.put("chiku", 3);
	ob.put("banana", 4);
//	ob.put(null, null);  //null pointer exe
	
	System.out.println(ob);
	
	
	
	

}
}
