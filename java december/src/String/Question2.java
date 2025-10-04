//2.enter a string by user and convert it in lower case
package String;
import java.util.Scanner;
public class Question2 {
	static void Q2(String s)
	{
		System.out.println("String in lower case = "+s.toLowerCase());
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next();
	Q2(s);
}
}
