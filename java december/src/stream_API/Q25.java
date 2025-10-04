//Q25. Write a program to convert a list of strings to a map
//where the key is the length of the string and the value 
//is a list of strings of that length using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q25 {
public static void main(String[] args) {
	 List<String> names = Arrays.asList("apple", "bat", "ball", "cat", "dog", "elephant");
    
	 Map<Integer, List<String>> lengthMap = names.stream()
         .collect(Collectors.groupingBy(String::length));
	 
     System.out.println("Q25: " + lengthMap);
}
}
