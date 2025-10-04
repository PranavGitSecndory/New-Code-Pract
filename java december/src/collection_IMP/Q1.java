
//1. Remove Duplicates  
//   - Question: Given an ArrayList of integers,
//remove duplicates while preserving order.
//   - Input: [1, 2, 2, 3, 4, 4, 5]
//   - Output: [1, 2, 3, 4, 5]
package collection_IMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q1 {
public static void main(String[] args) {
	ArrayList<Integer> li= new  ArrayList<Integer>( Arrays.asList(1,2,2,3,4,4,5));
	System.out.println("before : "+li);
	LinkedHashSet<Integer> set =new LinkedHashSet<Integer>(li);

    ArrayList<Integer> result = new ArrayList<>(set);
	
	
	System.out.println("After remove : "+result);
	
}
}
