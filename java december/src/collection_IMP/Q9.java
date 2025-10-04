//9. Sort a Stack  
//   - Question: Sort a stack in ascending order using another stack.
//   - Input: [3, 1, 4, 2]
//   - Output: [1, 2, 3, 4]
package collection_IMP;

import java.util.Collections;
import java.util.Stack;

public class Q9 {
public static void main(String[] args) {
	 Stack<Integer> stack = new Stack<>();
     stack.push(3);
     stack.push(1);
     stack.push(4);
     stack.push(2);
     
     System.out.println("Before sort : "+stack);
     
     Collections.sort(stack);
     System.out.println("After sort : "+stack);
}
}
