package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_demo {
public static void main(String[] args) {
	Queue ob =new ArrayDeque();
	
	ob.add(10);
	ob.add(87);
	ob.add(56);
	ob.add(4);
	System.out.println(ob);
	
	System.out.println(ob.remove());
	System.out.println(ob.poll());
	System.out.println(ob);
	System.out.println("retrive from head : "+ob.peek());
	System.out.println("Head from queue : "+ob.element());
	System.out.println(ob);
}
}
