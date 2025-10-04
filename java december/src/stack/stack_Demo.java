package stack;

import java.util.Stack;

public class stack_Demo {
public static void main(String[] args) {
	Stack ob=new Stack();
	
	ob.push(10);
	ob.push(20);
	ob.push(30);
	ob.push(40);
	System.out.println(ob);
	System.out.println("----------------------");
	
	
	System.out.println(ob.pop());
	System.out.println(ob.pop());
	System.out.println(ob.pop());

	System.out.println("_______________________");
	System.out.println(	ob.peek());
	System.out.println(	ob.peek());
	
	System.out.println("staclk is : "+ob);
	
}
}
