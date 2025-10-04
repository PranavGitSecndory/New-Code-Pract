package stack;


import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Stack;
class sort implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 < o2)
		{
			return 1;
		}
		else if(o1 > o2)
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}
}
public class Q3 {
public static void main(String[] args) {
 Stack<Integer> stack = new Stack<>();
	 
	 stack.push(10);
	 stack.push(520);
	 stack.push(300);
	 stack.push(240);
	 System.out.println(stack);
	 
	Collections.sort(stack, new sort());
	System.out.println(stack);
	 
	 
}
}
