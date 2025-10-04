
package collection;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_method {
	public static void main(String[] args) {
	/*	
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(2);
		
	
		System.out.println(list.contains(3));
		
		System.out.println(list.indexOf(2));
		System.out.println(list.lastIndexOf(2));
		
	
		System.out.println(list.remove(4));
		System.out.println(list);
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		
		
		System.out.println(list1.remove("2"));
		System.out.println(list1);
				
		System.out.println(list1.removeAll(list1));
		System.out.println(list1);
	
System.out.println("-------------------------------------------------");


		ArrayList<String> list2=new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		System.out.println("sirst element :"+list2);
		
		ArrayList<String> list3=new ArrayList<>();
		list3.add("a");
		list3.add("b");
		list3.add("d");
		list3.add("e");
		System.out.println("sirst element :"+list3);
		
		list2.retainAll(list3);
		System.out.println(list3);
		
		
		
		ArrayList<Integer> list4=new ArrayList<>();
		list4.add(1);
		list4.add(2);
		list4.add(3);
		list4.add(4);
		list4.add(5);
		list4.add(2);
		
		Object[] obj=list4.toArray();
		
		for(Object ob : obj)
		{
			System.out.println(ob);
		}
		*/
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(2);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("after sort ="+list);
		
		Collections.shuffle(list);
		System.out.println("after suffle ="+list);
		
		Collections.reverse(list);
		System.out.println("after reverse ="+list);
		
	}
}























