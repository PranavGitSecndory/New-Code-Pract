package Queue;

import java.util.ArrayDeque;

public class arrayDeque_demo {
public static void main(String[] args) {
	ArrayDeque ob =new ArrayDeque();
	ob.push(10);
	ob.push(101);
	ob.push(102);
	ob.offer(29);
	ob.add(200);
	ob.offerFirst(20);
	ob.offerLast(300);
	System.out.println(ob);

}
}
