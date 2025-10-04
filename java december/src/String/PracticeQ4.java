package String;
import java.util.Scanner;
public class PracticeQ4 {
	static void Q4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		if(s.length()<=0)
		{
			System.out.println("String is empty");
		}
		else
		{
			System.out.println("String is not empty");
		}	
	}
public static void main(String[] args)
{
	Q4();
}
}
