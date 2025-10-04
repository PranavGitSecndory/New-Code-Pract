//6. Reverse a String  
//   - Question: Use a Stack to reverse a string.
//   - Input: "hello"
//   - Output: "olleh"
package stack;

import java.util.Stack;

public class Reverse_Satck {
public static void main(String[] args) {
	String s="Hello";
	Stack<Character> ob =new Stack();
	
	 for (int i = 0; i < s.length(); i++) 
	 {
         ob.push(s.charAt(i));
     }
	 String r="";
	 for (int i = 0; i < s.length(); i++)
	 {
         r += ob.pop();
     }
	 System.out.println("Reverse string : "+r);
}
}
