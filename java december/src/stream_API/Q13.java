//Q13. Write a program to remove null values from a list using streams.

package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q13 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,5,7,5,4,null);
	
	List<Integer> list=li.stream().filter(i ->i != null)
			.collect(Collectors.toList());
	
	System.out.println(list);
			
		
}
}
