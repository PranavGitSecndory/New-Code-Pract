package practice_pranav;
class Student{
	String Name;
	int age;
	
	public String age()
	{
		if(age<18)
		{
			return "not eligible";
		}
		else if(age==18)
		{
			return "wait 1 year";
		}
		else
		{
			return "Eligible";
		}
	}
	
	
	public void display()
	{
		System.out.println("Name = "+Name+"\nage = "+age+"\nage is = "+age());
	}
	
}
public class Q2_Studeant_Data {
public static void main(String args[])
{
	Student ob= new Student();
	ob.Name="sagar";
	ob.age=17;
	ob.display();
	
	
}
}
