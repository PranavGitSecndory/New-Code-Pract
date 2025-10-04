//
//Q6. Implement a program to convert a list of 
//strings to uppercase using streams.
package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q6 {
public static void main(String[] args) {
	List<String > li = Arrays.asList("sagar","ketan", "kalyani","Divesh","Nikhil");
	
	List<String> upper =li.stream()
			.map(s->s.toUpperCase())
			.collect(Collectors.toList());
	
	System.out.println("Uppercase : "+upper);
	
}
}
