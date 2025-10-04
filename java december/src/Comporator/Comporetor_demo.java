package Comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student implements Comparator<Student>
{
	private int rollno;
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public  Student(int rollno, String name, int age) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return "\n rollno=" + rollno + ", name=" + name + ", age=" + age + "";
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int compare(Student s1,Student s2)
	{
		if(s1.getName().compareTo(s2.getName()) == 0)
			return 0;
		else if(s1.getName().compareTo(s2.getName()) > 0)
			return 1;
		else 
			return -1;
	}

}
class AgeSort implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		if(o1.getAge() == o2.getAge())
			return 0;
		else if(o1.getAge() < o2.getAge())
			return 1;
		else
			return -1;
	}
	
}

public class Comporetor_demo implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) 
	{
		if(o1.getRollno() == o2.getRollno())
			return 0;
		else if(o1.getRollno() > o2.getRollno())
			return 1;
		else
			return -1;
	}

public static void main(String[] args) {
	ArrayList<Student> ob=new ArrayList();
	ob.add(new Student(1,"nick",23));
	ob.add(new Student(2,"sagar",21));
	ob.add(new Student(3,"ketan",13));
	ob.add(new Student(4,"divesh",20));
	System.out.println(ob);
	
	System.out.println("Age Sort : --------------");
	Collections.sort(ob,new AgeSort());
	System.out.println(ob);

	System.out.println(" Name Sort .....");
	Collections.sort(ob,new Student());
	System.out.println(ob);
	
	System.out.println(" RollNo  Sort .....");
	Collections.sort(ob,new Comporetor_demo());
	System.out.println(ob);
	
}
}
