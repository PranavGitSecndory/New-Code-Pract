//13. First Non-Repeating Character  
//    - Question: Find the first non-repeating character in a string using a HashMap.
//    - Input: "swiss"
//    - Output: "w"
package collection_IMP;

import java.util.HashMap;

public class Q13 {
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
}
}
