//Question 2: Count the number of words in a sentence.
//Write a method that takes a sentence as input and returns
//the count of words in the sentence. Assume that words 
//are separated by spaces. Use the Stream API to solve this problem.
package stream_API;

import java.util.Arrays;

public class Q2 {
public static void main(String[] args) {
	   String s = "Java is simple and powerful";
	   
	   long count =Arrays.stream(s.trim().split("\\s")).count();
	   System.out.println("number of words : "+count);
}
}
