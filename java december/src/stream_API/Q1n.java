//Q1.Write a program to create a stream from a list of 

//integers and print each element.
package stream_API;

import java.util.Arrays;
import java.util.List;

public class Q1n {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	li.stream().forEach(num-> System.out.println(num));
}
}
