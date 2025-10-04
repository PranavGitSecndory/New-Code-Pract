//2. Find Intersection  
//   - Question: Given two ArrayList of integers, return the intersection elements in an ArrayList.
//   - Input: [1, 2, 3, 4] and [3, 4, 5, 6]
//   - Output: [3, 4]
package collection_IMP;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
public static void main(String[] args) {
	ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
	ArrayList<Integer> li1 = new ArrayList<Integer>(Arrays.asList(3,4,5,6));
	
	li.retainAll(li1);
	System.out.println("insertion element is : "+li);
}
}
