//1.enter a string by user and search particular
//element are present or not

package String;
import java.util.Scanner;
public class Question1 {
	
	static void Q1(String s, char ch)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(ch==s.charAt(i)) {
		System.out.println(ch+" is a present at "+i+" position");
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		System.out.println("enter the char");
		char ch=sc.next().charAt(0);
		Q1(s,ch);
	}

}
