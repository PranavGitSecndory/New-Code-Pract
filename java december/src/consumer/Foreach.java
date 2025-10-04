package consumer;

import java.util.HashMap;

public class Foreach {
public static void main(String[] args) {
	HashMap<String,Integer> ob=new HashMap();
	
	ob.put("Apple", 1);
	ob.put("mango", 2);
	ob.put("papai", 3);
	
	ob.forEach((a,b) -> System.out.println(a+" "+b));	
}
}
