//
//Q2.Implement a program to filter even numbers from
//a list using the Stream API.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2n {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	List<Integer>even = li.stream().filter(n -> n%2== 0).collect(Collectors.toList());
System.out.println("Even number : "+even);
}
}
