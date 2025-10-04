package map;
import java.util.HashMap;
import java.util.Map;

public class Map_demo {
public static void main(String[] args) {
	Map<String, Integer> mp =new HashMap<String, Integer>();
	mp.put("Apple", 23);
	mp.put("mango", 43);
	mp.put("banana", 63);
	mp.put("chiku", 33);
	mp.put("pear", 13);
	System.out.println(mp);
	
	System.out.println(mp.containsKey("Apple"));
	System.out.println(mp.containsValue(43));
	System.out.println(mp.get("Apple"));
	System.out.println(mp.remove("Apple"));
	
	System.out.println(mp.containsKey("Apple"));
}
}
