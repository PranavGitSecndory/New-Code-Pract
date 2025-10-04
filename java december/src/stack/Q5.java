//5. Write a Java program to find the maximum and minimum 
//elements in a stack
package stack;

import java.util.Collections;
import java.util.Stack;

public class Q5 {
public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	 
	 stack.push(10);
	 stack.push(520);
	 stack.push(300);
	 stack.push(240);
	 System.out.println(stack);
	 
	 System.out.println(Collections.max(stack));
	 System.out.println(Collections.min(stack));
}
}
