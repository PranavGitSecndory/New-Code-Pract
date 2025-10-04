//
//Given a list of numbers with duplicates,
//use a LinkedHashSet to remove duplicates and 
//maintain insertion order.
package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Linkhashset_Q9 {
public static void main(String[] args) {
	   List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 40, 20, 50, 30);

       System.out.println("Original List: " + numbers);

       
       LinkedHashSet <Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

       List<Integer> resultList = new ArrayList(uniqueNumbers);

       System.out.println("List after removing duplicates: " + resultList);
}
}
