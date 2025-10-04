//7. Check Balanced Parentheses  
//   - Question: Check if the parentheses 
//in a string are balanced using a Stack.
//   - Input: "(([]){})"
//   - Output: true
package collection_IMP;

import java.util.Stack;

public class Q7 {
public static void main(String[] args) {
	String s="(([]){})";
	
	 boolean result = isBalanced(s);
     System.out.println("Is balanced? " + result);
 }

 public static boolean isBalanced(String str) {
     Stack<Character> stack = new Stack<>();

     for (char ch : str.toCharArray()) {
         if (ch == '(' || ch == '{' || ch == '[') {
             stack.push(ch);
         } else if (ch == ')' || ch == '}' || ch == ']') {
             if (stack.isEmpty()) return false;
             char top = stack.pop();
             if (!isMatchingPair(top, ch)) return false;
         }
     }

     return stack.isEmpty();
 }

 public static boolean isMatchingPair(char open, char close) {
     return (open == '(' && close == ')') ||
            (open == '[' && close == ']') ||
            (open == '{' && close == '}');
 }
}

