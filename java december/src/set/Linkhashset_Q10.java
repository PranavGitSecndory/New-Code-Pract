//
//Implement a method that accepts a List<String> 
//and returns a LinkedHashSet<String> with duplicates removed.
package set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Linkhashset_Q10 {
public static void main(String[] args) {
	 List<String> ob = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");


     LinkedHashSet<String> result = removeDuplicates(ob);

     System.out.println("Original List: " + ob);
     System.out.println("After removing duplicates: " + result);
 }


 public static LinkedHashSet<String> removeDuplicates(List<String> inputList) 
 {
     return new LinkedHashSet<>(inputList);
}
}
