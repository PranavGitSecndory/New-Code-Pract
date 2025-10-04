// 4. Balanced Parentheses
//   Write a program that checks whether a string of 
//   parentheses (i.e., (), {}, []) is balanced using ArrayDeque.
package Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Q4 {
	  public static boolean isBalanced(String str) {
	        ArrayDeque<Character> stack = new ArrayDeque<>();

	        for (char ch : str.toCharArray()) {
	            if (ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch);
	            } else if (ch == ')' || ch == '}' || ch == ']') {
	                if (stack.isEmpty()) return false;

	                char top = stack.pop();
	                if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty();
	    }
	
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string of parentheses: ");
      String input = sc.nextLine();

      ArrayDeque<Integer> ob =new ArrayDeque<Integer>();
      
      if (isBalanced(input)) 
      {
          System.out.println("The string has balanced parentheses.");
      } else 
      {
          System.out.println("The string does not have balanced parentheses.");
      }
      
}
}
