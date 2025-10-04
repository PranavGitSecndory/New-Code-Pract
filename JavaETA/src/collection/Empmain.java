package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Empmain {
	public static void main(String[] args) 
	{
		Emp e1=new Emp(101,"virat",20000);
		Emp e2=new Emp(102,"rohit",40000);
		Emp e3=new Emp(103,"rahul",30000);
		
		ArrayList<Emp> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println("Before Sorting");
		for(Emp e:list)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		
		sortbyid  sb=new sortbyid ();
		
		Collections.sort(list, sb);;
		System.out.println();
		System.out.println("After Sort By Name");
		for(Emp e:list)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
	}
}

