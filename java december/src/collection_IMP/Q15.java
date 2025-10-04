//
//
//15. Group Anagrams  
//    - Question: Group anagrams from a list of strings using a HashMap.
//    - Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//    - Output: [[eat, tea, ate], [tan, nat], [bat]]
package collection_IMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q15 {
	  public static void main(String[] args) {
	        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        Map<String, List<String>> map = new HashMap<>();

	        for (String word : words) {
	            char[] arr = word.toCharArray();
	            Arrays.sort(arr);
	         
	            String key = new String(arr); // Sorted string is the key

	            map.computeIfAbsent(key, x -> new ArrayList<>()).add(word);
	        }

	        List<List<String>> result = new ArrayList<>(map.values());
	        System.out.println("Grouped Anagrams: " + result);
	    }
}
