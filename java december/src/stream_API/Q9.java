//Q9. Write a program to find the square of each 
//element in a list using streams.

package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,5,7,5,4);
	
	List<Integer> Square= li.stream()
							.map(n->n*n)
							.collect(Collectors.toList());
	
	System.out.println("orignal list : "+li);
	System.out.println("after find square list : "+Square);
}
}
