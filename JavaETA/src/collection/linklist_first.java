package collection;

import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.LinkedList;

public class linklist_first {
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(10);
		list.add(30);
		list.add(1,70);
		System.out.println(list);
		
		list.set(0, 50);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		System.out.println("itr using each loop");
		for(Integer itr:list)
		{
			System.out.println(itr);
		}
		System.out.println("itr throug for each loop");
		
		Iterator<Integer> iterator= list.iterator();

		
		while(iterator.hasNext())
		{
		System.out.println(iterator.next());
		}
		System.out.println("after remove");
		list.remove(2);
		System.out.println(list);
	}
}
