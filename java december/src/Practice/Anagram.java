package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
	 
	    public static void main(String[] args) {
	        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};

	        Map<String, List<String>> map = new HashMap<>();

	        for (String word : s) {
	            char[] ch = word.toCharArray();
	            Arrays.sort(ch);
	            String key = new String(ch);

	            if (!map.containsKey(key)) {
	                map.put(key, new ArrayList<>());
	            }
	            map.get(key).add(word);
	        }
	      
	        for (List<String> group : map.values()) {
	            System.out.println(group);
	        }
	    }
}
