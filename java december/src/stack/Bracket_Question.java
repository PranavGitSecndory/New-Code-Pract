////Given a string s representing an expression containing 
//various types of brackets: {}, (), and [], the task is to
//determine 
//whether the brackets in the expression are balanced
//or not. A balanced expression is one where every opening
//bracket has a corresponding closing bracket in the
//correct order.

//Example: 
//
//Input: s = “[{()}]”
//Output: true
//Explanation:  All the brackets are well-formed.
//
//
//Input: s = “[()()]{}”
//Output: true
//Explanation: All the brackets are well-formed.
//
//
//Input: s = “([]”
//Output: false
//Explanation: The expression is not balanced as 
//there is a missing ‘)’ at the end.
//
//
//Input:  s = “([{]})”
//Output: false
//Explanation: The expression is not balanced 
//because there is a closing ‘]’ before the closing ‘}’.
package stack;

import java.util.Stack;


public class Bracket_Question {
	public static boolean isBalanced(String s) 
	{
	    Stack<Character> ob = new Stack<>();

	    for (int i = 0; i < s.length(); i++)
	    {
	        char ch = s.charAt(i);

	        if (ch == '(' || ch == '[' || ch == '{') {
	            ob.push(ch);
	        } 
	        else
	        {
	            if (ob.isEmpty())
	            	return false;

	            char top = ob.pop();
	            if ((ch == ')' && top != '(') ||
	                (ch == '}' && top != '{') ||
	                (ch == ']' && top != '['))
	            {
	                return false;
	            }
	        }
	    }
	    return ob.isEmpty();
	}
public static void main(String[] args) 
{
	 String s = "{}()[]"; 
	 boolean result = isBalanced(s);
     System.out.println(result);
}
}


