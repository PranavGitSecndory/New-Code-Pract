//
//12. Find Common Characters  
//    - Question: Find common characters in two strings using a HashMap.
//    - Input: "hello", "world"
//    - Output: ["o", "l"]
package collection_IMP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q12 {
public static void main(String[] args) {
	  String s1 = "hello";
      String s2 = "world";

      Set<Character> set1 = new HashSet();
      List<Character> common = new ArrayList();

      for (char c : s1.toCharArray()) {
          set1.add(c);
      }

      for (char c : s2.toCharArray()) {
          if (set1.contains(c)) {
              common.add(c);
              set1.remove(c); // To avoid duplicate entries
          }
      }

      System.out.println("Common characters: " + common);
}
}
