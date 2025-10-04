//5. Reverse Order Using Comparable:
//Extend the Employee class from the previous question to
//use the Comparable interface to sort employees by name in reverse 
//alphabetical order.
package Comperaable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	private String s;
	public Employee (String s) {
		this.s=s;
		}

		public String getStr() {
	        return s;
	    }
		public void setS(String s) {
			this.s = s;
		}
		 public String toString() {
		        return s;
		    }
	
		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return o.s.compareTo(this.s);
		}
	
}
public class Q2 {
public static void main(String[] args) {
	Employee ob=new Employee("nick");
	Employee ob1=new Employee("sagar");
	Employee ob2=new Employee("akash");
	Employee ob3=new Employee("divesh");
	
	ArrayList<Employee> obb =new ArrayList();
	obb.add(ob);
	obb.add(ob1);
	obb.add(ob2);
	obb.add(ob3);
	System.out.println("before sort : "+obb);
	Collections.sort(obb);
	System.out.println("after sort :"+obb);
}
}
