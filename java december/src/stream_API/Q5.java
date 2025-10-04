//
//Q5. Write a program to count the number of elements 
//in a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;

public class Q5 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,5,7,5,4);
	
	long count = li.stream().count();
	System.out.println("count the number of element is : "+count);
}
}
