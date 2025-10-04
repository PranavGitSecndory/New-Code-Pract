//11. Frequency Count  
//    - Question: Count the frequency of each element in an array using a HashMap.
//    - Input: [1, 2, 2, 3, 3, 3]
//    - Output: {1=1, 2=2, 3=3}
package collection_IMP;

import java.util.HashMap;
import java.util.Map;

public class Q11 {
public static void main(String[] args) {
	int [] a={1,2,2,3,3,3};
	
	Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
	
	for(int n : a)
	{
        mp.put(n, mp.getOrDefault(n, 0) + 1);
	}
	
	System.out.println(mp);
}
}
