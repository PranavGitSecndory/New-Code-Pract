//10. Create a synchronized method that takes a string and prints each
//character one by one.
package syncronization;

import java.util.Scanner;

class print_char extends Thread
{
	public synchronized void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		
		System.out.println("String character print one by one ");
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class Q10 {
public static void main(String[] args) {
	print_char ob=new print_char();
	ob.start();
}
}
