package Comperaable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	private int RollNo;
	private String Name;
	private int age;
	
	public Student(int rollNo, String name, int age)
	{
		super();
		RollNo = rollNo;
		Name = name;
		this.age = age;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return "\n RollNo=" + RollNo + ", Name=" + Name + ", age=" + age + "";
	}
	@Override
	public int compareTo(Student o)
	{
		if(age == o.getAge())
			return 0;
		else if(this.age > o.getAge())
			return 1;
		else
			return -1;
	}

}
public class Comporeable_Demo {
public static void main(String[] args) {
	Student s1 = new Student(1,"nick",24);
	Student s2 = new Student(2,"sagar",21);
	Student s3 = new Student(3,"diu",14);
	Student s4 = new Student(4,"ketan",18);
	ArrayList<Student> ob=new ArrayList();
	
	ob.add(s1);
	ob.add(s2);
	ob.add(s3);
	ob.add(s4);
	System.out.println(ob);
	Collections.sort(ob);

	System.out.println("After sort");
	System.out.println(ob);
}
}
