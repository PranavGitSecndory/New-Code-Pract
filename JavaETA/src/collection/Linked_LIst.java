package collection;

import java.util.LinkedList;

public class Linked_LIst {
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(10);
		list.add(30);
		list.add(70);
		list.add("hello");
		list.add("nick");
		System.out.println(list);
		
		
		list.push(100);
		System.out.println(list);
		
		System.out.println(list.pop());
		
		System.out.println(list.removeFirst());
//		System.out.println(list.removeLast());
	
		
		System.out.println(list.removeFirstOccurrence("hello"));
		System.out.println(list);
//		System.out.println(list);
//		
//		list.offer(400);
//		System.out.println(list);
//		
//		list.offerFirst(1000);
//		System.out.println(list);
//		
//		list.offerLast(3000);
//		System.out.println(list);
//		
//		System.out.println(list.poll());
//		System.out.println(list);
//		
//		System.out.println(list.pollFirst());
//		System.out.println(list);
//		
//		System.out.println(list.pollLast());
//		System.out.println(list);
		
		
					
	}
}











