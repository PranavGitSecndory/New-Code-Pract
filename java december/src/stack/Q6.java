//6. Write a Java program to remove all elements from a stack.
//7. Write a Java program to count all stack elements.
//8. Write a Java program to implement a stack that checks 
//if a given element is present or not in the stack.

package stack;

import java.util.Stack;

public class Q6 {
public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	 
	 stack.push(10);
	 stack.push(520);
	 stack.push(300);
	 stack.push(240);
	 System.out.println(stack);
	 
	
	 System.out.println("count of stack :"+ stack.size());
	 
	 System.out.println("ptrsent or not : "+stack.contains(520));
	 System.out.println("ptrsent or not : "+stack.contains(50));
	 
	 
	 stack.clear();
	 System.out.println("empty stack :"+stack);
}
}
