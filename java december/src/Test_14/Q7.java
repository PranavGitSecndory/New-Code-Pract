//7.Write a program to handle NumberFormatException when 
//converting user input from String to int. Retry until valid input is given.
package Test_14;

import java.util.Scanner;
class Convert
{
	String str;
	public Convert(String num)
	{
		this.str = num;
	}
	
	public void display()
	{
		try {
			int num = Integer.parseInt(str);
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
public class Q7 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter here string");
		String str = sc.next();
		
		Convert obj = new Convert(str);
		obj.display();
	}

}
