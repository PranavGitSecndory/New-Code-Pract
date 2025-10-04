// 3. Reverse a List
//   Given a list of integers, use ArrayDeque to
//   reverse the elements and print the reversed list.
package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Q3 {
public static void main(String[] args) {
	List<Integer> List = Arrays.asList(10, 50, 30, 60, 100);
	System.out.println(List);
	
	ArrayDeque<Integer> ob =new ArrayDeque<Integer>();
	for(Integer num : List)
	{
		ob.push(num);
	}
	System.out.println(ob);
}
}
