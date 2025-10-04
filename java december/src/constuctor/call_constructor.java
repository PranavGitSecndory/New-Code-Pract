//7. Create a class Student with two constructors 
//one without parameters and another with name and age. 
//Use the this keyword to call one constructor from another.  

package constuctor;
class Student
{
	public Student()
	{
		this("nick",24);
		System.out.println("constructot without parameter");
	}
	public Student(String s,int a)
	{
	System.out.println("constructor with para");
	System.out.println("player name is = "+s);
	System.out.println("player age is = "+a);
	}
}
public class call_constructor {
	public static void main(String[] args) {
		Student s=new Student();
		
	}

}
