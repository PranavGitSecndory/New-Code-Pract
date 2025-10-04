//3. Define a LowMarksException that gets thrown if a student's
//marks are below 40.  
package Custom_Exeption;
import java.util.Scanner;
class LowMarks extends Exception
{
	LowMarks(String s)
	{
		super(s);
	}
}
public class Q3 {
	static void marks(int marks) throws LowMarks
	{
	if(marks <40)
	{
		throw new LowMarks("Student marks are below 40");
	}
	else
	{
	System.out.println("marks is above 40 and pass");	
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		try {
			int a=sc.nextInt();
			marks(a);
		} catch (Exception e) {
	System.out.println(e);
		}
	}

}
