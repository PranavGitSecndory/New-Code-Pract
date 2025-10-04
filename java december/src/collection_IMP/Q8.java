//8. Evaluate Postfix Expression  
//   - Question: Evaluate a postfix expression using a Stack.
//   - Input: "2 3 + 4 "
//   - Output: 20
package collection_IMP;

import java.util.Stack;

public class Q8 {
	 public static void main(String[] args) {
	        String expr = "2 3 + 4 *"; // equivalent to (2 + 3) * 4
	        int result = evaluatePostfix(expr);
	        System.out.println("Result: " + result);
	    }

	    public static int evaluatePostfix(String expr) {
	        Stack<Integer> stack = new Stack<>();
	        String[] tokens = expr.split(" ");

	        for (String token : tokens) {
	            if (isOperator(token)) {
	                int b = stack.pop();
	                int a = stack.pop();
	                int res = applyOperator(a, b, token);
	                stack.push(res);
	            } else {
	                stack.push(Integer.parseInt(token));
	            }
	        }

	        return stack.pop();
	    }

	    public static boolean isOperator(String token) {
	        return token.equals("+") || token.equals("-") ||
	               token.equals("*") || token.equals("/");
	    }

	    public static int applyOperator(int a, int b, String op) {
	        switch (op) {
	            case "+": return a + b;
	            case "-": return a - b;
	            case "*": return a * b;
	            case "/": return a / b;
	        }
	        return 0;
	    }
}
