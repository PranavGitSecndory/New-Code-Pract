//
//14. Top K Frequent Elements  
//    - Question: Find the top k frequent elements in an array.
//    - Input: [1, 1, 1, 2, 2, 3], k = 2
//    - Output: [1, 2]


package collection_IMP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q14 {
	 public static void main(String[] args) {
	        int[] nums = {1, 1, 1, 2, 2, 3};
	        int k = 2;

	        Map<Integer, Integer> freqMap = new HashMap();

	        // Count frequencies
	        for (int num : nums) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }

	        // Sort map entries by frequency and collect top k
	        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
	        list.sort((a, b) -> b.getValue() - a.getValue());

	        List<Integer> result = new ArrayList();
	        for (int i = 0; i < k; i++) {
	            result.add(list.get(i).getKey());
	        }

	        System.out.println("Top " + k + " frequent elements: " + result);
	    }
}
