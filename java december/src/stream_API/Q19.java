//
//Q19. Write a program to convert a list of integers
//to a comma-separated string using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q19 {
public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
    String joined = nums.stream()
        .map(String::valueOf)
        .collect(Collectors.joining(","));
    System.out.println("Q19: " + joined);
}
}
