//6. Reverse a String  
//   - Question: Use a Stack to reverse a string.
//   - Input: "hello"
//   - Output: "olleh"
package collection_IMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Q6 {
public static void main(String[] args) {
	 String str = "hello";
     Stack<Character> stack = new Stack<>();
	
     for (int i = 0; i < str.length(); i++) {
         stack.push(str.charAt(i));
     }

   
     String reversed = "";
     while (!stack.isEmpty()) {
         reversed += stack.pop(); 
     }

     System.out.println("Reversed string: " + reversed);
 }
}
