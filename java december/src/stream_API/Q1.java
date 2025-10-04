//Question 1: Find the sum of all even numbers in a list.

//Write a method that takes a list of integers as 
//input and returns the sum of all even numbers in the list. 
//Use the Stream API to solve this problem.
package stream_API;

import java.util.Arrays;
import java.util.List;

public class Q1 {
public static void main(String[] args) {
	List<Integer> li =Arrays.asList(10,12,15,20,25,30);
	
	int sum= li.stream().filter(n -> n%2== 0).reduce(0, (a,b)->a+b);
	System.out.println("sum of even numbers is : "+sum);
}
}
