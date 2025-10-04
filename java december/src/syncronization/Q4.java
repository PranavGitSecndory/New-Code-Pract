//4. Create a synchronized method that takes a name as 
//input and prints "Welcome, [name]". 
package syncronization;

import java.util.Scanner;

class print extends Thread
{
	public synchronized void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Take a Name");
		String name =sc.nextLine();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Welcome :"+name);
	}
}
public class Q4 {
public static void main(String[] args) {
	print ob=new print();
	ob.start();
}
}
