package stack;

import java.util.Stack;

public class Q4 {
public static void main(String[] args) {
 Stack<Integer> stack = new Stack<>();
	 
	 stack.push(10);
	 stack.push(520);
	 stack.push(300);
	 stack.push(240);
	 System.out.println(stack);
	 
	 System.out.println(stack.reversed());
}
}
