//
//Q16. Implement a program to partition a list into 
//even and odd numbers using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q16 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,5,7,5,4);
	
	Map<Boolean, List<Integer>> number =li.stream().collect(Collectors.partitioningBy(n-> n%2==0));

	List<Integer> even= number.get(true);
	List<Integer> odd =number.get(false);
	
	System.out.println("even number : "+even);
	System.out.println("odd number : "+odd);
	
}
}
