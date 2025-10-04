//Q8. Implement a program to find the average of all 
//numbers in a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q8 {
public static void main(String[] args) {
	List<Integer> li =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	double  avrage = li.stream()
							.collect(Collectors.averagingDouble(i->i));
	
	System.out.println("avreage of all elements : "+avrage);
}
}
