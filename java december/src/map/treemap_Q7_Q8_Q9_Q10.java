//
//7. Write a Java program to sort keys in a
//Tree Map by using a comparator.
//


package map;

import java.util.Comparator;


import java.util.Map;
import java.util.TreeMap;


public class treemap_Q7_Q8_Q9_Q10 {
public static void main(String[] args) {
	  Comparator<String> reverseOrder = new Comparator<String>() {
          public int compare(String s1, String s2) {
              return s2.compareTo(s1);
          }
      };

      TreeMap<String, Integer> ob = new TreeMap<>(reverseOrder);
      ob.put("Apple", 10);
      ob.put("Mango", 5);
      ob.put("Banana", 8);
      ob.put("Cherry", 12);

      for (Map.Entry<String, Integer> entry : ob.entrySet()) {
          System.out.println(entry.getKey() + " => " + entry.getValue());
      }
}
}
