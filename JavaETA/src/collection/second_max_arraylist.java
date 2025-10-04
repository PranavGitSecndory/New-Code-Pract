package collection;
import java.util.ArrayList;
import java.util.Collections;

public class second_max_arraylist {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(2);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("second max is ="+list.get(list.size()-2));
		
	}

}
