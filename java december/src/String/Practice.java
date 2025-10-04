package String;

import java.util.Scanner;
public class Practice {
	static void practice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		System.out.println("enter the 2nd string");
		String s1=sc.nextLine();
		
		System.out.println("string to print in = "+s);
		System.out.println("length of string is = "+s.length());
		System.out.println("conct the two string = "+s.concat(s1));
	}
public static void main(String[] args) {
	practice();
}
}
