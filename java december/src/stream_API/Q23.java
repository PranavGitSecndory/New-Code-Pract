//Q23. Write a program to create a stream of 
//numbers from 1 to 100 and find the sum of squares of all even numbers.

package stream_API;

import java.util.stream.IntStream;

public class Q23 {
public static void main(String[] args) {
	  int sumOfSquares = IntStream.rangeClosed(1, 100)
	            .filter(n -> n % 2 == 0)
	            .map(n -> n * n)
	            .sum();
	        System.out.println("Q23: " + sumOfSquares);
}
}
