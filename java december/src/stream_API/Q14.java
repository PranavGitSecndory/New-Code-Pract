
//Q14. Implement a program to concatenate two lists using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q14 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(5,7,6);
	List<Integer> li1 = Arrays.asList(1,2,3,4);
	
	List<Integer> list = Stream.concat(li1.stream(), li.stream())
			.collect(Collectors.toList());
	System.out.println(list);
}
}
