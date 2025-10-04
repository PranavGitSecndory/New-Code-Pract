//
//Q10. Implement a program to check if all elements 
//in a list are greater than a certain value using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;

public class Q10 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,5,7,5,4);
	int k=0;
	Boolean allgreat = li.stream()
			.allMatch(n->n>k);
	
	System.out.println("All elements greater than " + k + " ? \n" + allgreat);
	
}
}
