//
//Q20. Implement a program to find the longest
//string in a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q20 {
public static void main(String[] args) {
	   List<String> listOfStrings = Arrays.asList("cat", "elephant", "tiger", "lion");
       String longest = listOfStrings.stream()
           .max(Comparator.comparingInt(String::length))
           .orElse("");
       System.out.println("Q20: " + longest);
}
}
