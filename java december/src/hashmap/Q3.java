//3. Find the First Non-Repeating Character in a String
//   Problem Description:  
//   Write a Java program to find the first non-repeating
//character in a string using HashMap.
//
//   Input: A string.  
//   Output: The first non-repeating character, or null if all repeat.
//
//   Example:
//   - Input: "swiss"
//   - Output: 'w'
package hashmap;

import java.util.HashMap;

public class Q3 {
public static void main(String[] args) {
	String s="swiss";
	HashMap<Character , Integer> ob=new HashMap();
	
	 for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         if (ob.containsKey(ch)) {
          ob.put(ch,ob.get(ch) + 1);
         } else {
           ob.put(ch, 1);
         }
     }
	
	 for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         if (ob.get(ch) == 1) {
             System.out.println("First non-repeating character: " + ch);
             return;
         }
}
	 System.out.println("element found ");
}}
