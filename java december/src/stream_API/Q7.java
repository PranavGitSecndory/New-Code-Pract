//Q7. Write a program to sort a list of strings in 
//ascending order using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {
public static void main(String[] args) {
	List<String > li = Arrays.asList("sagar","ketan", "kalyani","Divesh","Nikhil");
	
	List<String> assen= li.stream()
				.sorted()
				.collect(Collectors.toList());
	
	System.out.println("Sorterd order is : "+assen);
}
}
