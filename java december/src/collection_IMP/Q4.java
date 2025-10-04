//4. Find Missing Number  
//   - Question: Given an ArrayList containing numbers 
//1 to n with one number missing, find the missing number.
//   - Input: [1, 2, 3, 5]
//   - Output: 4
package collection_IMP;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
	public static void main(String[] args) {
		
	
	   ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
       int n = 5; // max number in range

       int expectedSum = n * (n + 1) / 2;
       int actualSum = 0;

       for (int num : list) {
           actualSum += num;
       }

       int missing = expectedSum - actualSum;
       System.out.println("Missing number is: " + missing);
   }
}
