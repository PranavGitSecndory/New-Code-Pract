//Q15. Write a program to find the second smallest 
//element in a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;

public class Q15 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,5,7,5,4);

	int s =li.stream().sorted().skip(1)
			.findFirst().orElse(null);
	
	System.out.println("Second small : "+s);
}
}
