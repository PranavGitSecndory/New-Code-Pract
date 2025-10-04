//Q11. Write a program to find the first occurrence of a given element
//in a list using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q11 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,5,7,5,4);
	int k=5;
	
	int index = IntStream.range(0, li.size()).filter(i->li.get(i)==k)
			.findFirst().orElse(-1);
	
	System.out.println("Index is : "+index);
}
}
