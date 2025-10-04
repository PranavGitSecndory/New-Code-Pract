//3. Rotate ArrayList  
//   - Question: Rotate an ArrayList of integers by k steps.
//   - Input: [1, 2, 3, 4, 5], k = 2
//   - Output: [4, 5, 1, 2, 3]
package collection_IMP;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3 {
public static void main(String[] args) {
	ArrayList<Integer> li =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	int k=2;
	
	k=k%li.size();
	
    ArrayList<Integer> lastPart = new ArrayList<>(li.subList(li.size() - k, li.size()));
    ArrayList<Integer> firstPart = new ArrayList<>(li.subList(0, li.size() - k));
    
    lastPart.addAll(firstPart);
    
    System.out.println(lastPart);
	
	
}
}
