//Q4. Implement a program to find the maximum element 
//from a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;

public class Q4 {
public static void main(String[] args) {
	List<Integer> li= Arrays.asList(1,3,5,6,8,3,1,9,4,3,2);
	
	int max= li.stream().sorted((a,b)->b-a)
			.findFirst()
			.orElse(null);
	
	System.out.println("maximum element : "+max);
}
}
