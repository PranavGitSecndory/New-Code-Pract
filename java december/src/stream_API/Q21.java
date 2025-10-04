//Q21. Write a program to remove duplicate elements from
//a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q21 {
public static void main(String[] args) {
   List<Integer> duplicates = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
    List<Integer> unique = duplicates.stream()
        .distinct()
        .collect(Collectors.toList());
    System.out.println("Q21: " + unique);
}
}
