//Q24. Implement a program to find the cumulative sum
//of elements in a list using streams.
package stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Q24 {
public static void main(String[] args) {
	List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
	
    List<Integer> cumulativeSum = new ArrayList<>();
    
    AtomicInteger sum = new AtomicInteger();
    
    values.stream().forEach(n -> cumulativeSum.add(sum.addAndGet(n)));
    
    System.out.println("Q24: " + cumulativeSum);
}
}
