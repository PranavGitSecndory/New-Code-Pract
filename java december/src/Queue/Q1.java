//1. Basic Operations with ArrayDeque
//   Write a program to perform the following operations using ArrayDeque:
//   - Add elements to the front and back of the deque.
//   - Remove elements from both ends.
//   - Print the final state of the deque.
package Queue;

import java.util.ArrayDeque;

public class Q1 {
public static void main(String[] args) {
	ArrayDeque ob =new ArrayDeque();
	ob.push(10);
	ob.push(101);
	ob.push(102);
	ob.offer(29);
	ob.add(200);
	System.out.println(ob);
	
	ob.offerFirst(20);
	System.out.println("Front of deque list : "+ob);
	ob.offerLast(300);
	System.out.println("last of deque list :"+ob);
	ob.removeFirst();
	System.out.println("remove first :"+ob);
	ob.removeLast();
	System.out.println("Remove last :"+ob);
	
	System.out.println("final state deque : "+ob);
}
}
