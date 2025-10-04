
//Q18. Implement a program to find the most frequently 
//occurring element in a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q18 {
public static void main(String[] args) {
    List<String> items = Arrays.asList("apple", "banana", "apple", "cat", "apple", "dog", "banana");
    String mostFrequent = items.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream()
        .max(Map.Entry.comparingByValue())
        .get().getKey();
    System.out.println("Q18: " + mostFrequent);
}
}
