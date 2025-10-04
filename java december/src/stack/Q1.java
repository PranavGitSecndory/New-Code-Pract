//1. Write a Java program to implement a stack with push
//and pop operations. Find the top element of the stack
//and check if it is empty or not.
package stack;

import java.util.Stack;

public class Q1 {
public static void main(String[] args) {
	 Stack<Integer> stack = new Stack<>();

     System.out.println("Is stack empty? : " + stack.isEmpty());

     stack.push(10);
     stack.push(20);
     stack.push(30);
     System.out.println("Stack after pushes: " + stack);

     System.out.println("Top element: " + stack.peek());

     System.out.println("Popped element: " + stack.pop());

     System.out.println("Stack now: " + stack);
     
     System.out.println("Is stack empty? : " + stack.isEmpty());
 }
}

