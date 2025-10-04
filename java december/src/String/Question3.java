//3.enter a string by user and convert it in upper case
package String;
import java.util.Scanner;
public class Question3 {
	static void Q3(String s)
	{
		System.out.println("String in upper case = "+s.toUpperCase());
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s =sc.next();
	Q3(s);
}
}
