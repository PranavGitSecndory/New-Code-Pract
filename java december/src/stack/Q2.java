//2. Write a Java program to sort the elements of a given 
//stack in ascending order.
package stack;

import java.util.Collections;
import java.util.Stack;

public class Q2 {
public static void main(String[] args) {
	 Stack<Integer> stack = new Stack<>();
	 
	 stack.push(10);
	 stack.push(520);
	 stack.push(300);
	 stack.push(240);
	 System.out.println(stack);
	 Collections.sort(stack);
	 System.out.println(stack);
}
}
