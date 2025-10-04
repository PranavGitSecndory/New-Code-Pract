//1. Basic Comparable Usage:
//Implement the Comparable interface for a 
//class representing a Person with attributes like name,
//age, and height. Sort an array of Person objects based on their age.
package Comperaable;

import java.util.ArrayList;
import java.util.Collections;
class age implements Comparable<age>
{
	private String Name;
	private int Age;
	private float Hight;
	 public age(String name, int age, float height) {
	        this.Name = name;
	        this.Age = age;
	        this.Hight = height;
	    }
	public int getAge() {
		return Age;
	}
	public String toString()
	{
		return "\n Name ="+ Name +"Age ="+Age+"Hight ="+Hight;
	}
	@Override
	public int compareTo(age o) {
		if(this.Age == o.getAge())
		{
		return 0;
		}
		else if(this.Age > o.getAge())
		{
			return 1;
		}
		return -1;
	}
	
}
public class Q3 {
public static void main(String[] args) {
	ArrayList<age> ob=new ArrayList();
	ob.add(new age("sagar",21,5.2f));
	ob.add(new age("sagar",24,5.0f));
	ob.add(new age("sagar",20,5.8f));
	ob.add(new age("sagar",12,4.7f));
	
	System.out.println("Before age sort :"+ob);
	Collections.sort(ob);
	System.out.println("After the age sort : "+ob);
	
}
}
