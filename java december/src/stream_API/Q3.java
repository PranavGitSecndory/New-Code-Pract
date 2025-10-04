//Q3. Write a program to find the sum of all elements 
//in a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;

public class Q3 {
public static void main(String[] args) {
	List<Integer> li =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	int sum= li.stream().reduce(0,(a,b)-> a+b);
	System.out.println("Sum of all element : "+sum);
	
}
}
