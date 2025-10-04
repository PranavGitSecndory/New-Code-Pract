//Q12. Implement a program to find the distinct elements 
//in a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q12 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,5,7,5,4);
	
	List<Integer> list=li.stream().distinct()
			.collect(Collectors.toList());
	
	System.out.println(list);
	
}
}
