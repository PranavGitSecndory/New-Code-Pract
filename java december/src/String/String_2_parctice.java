package String;
import java.util.Scanner;
import java.util.Arrays;
public class String_2_parctice {
	static void String2()
	{
		String str="this is java program this java code and java problems";
		String str1[] = str.split(" ");
		System.out.println("occurence of first word :"+str.indexOf(str1[0]));
		System.out.println("occurence of first char :"+str.indexOf(str.charAt(0)));
		
		System.out.println("occurence of last word :"+str.lastIndexOf(str1[str1.length-1]));
		System.out.println("occurence of last char :"+str.lastIndexOf(str.charAt(str.length()-1)));
		

	}
public static void main(String[] args) {
	 String2();
  }

}
