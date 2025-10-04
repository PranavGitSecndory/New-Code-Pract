//9. Write a Java program that creates two threads,
//where one thread prints even numbers and the other prints
//odd numbers from 1 to 100.  
package test_16;

public class Q6 extends Thread {

	public synchronized void printNumber()
	{
		System.out.println("Even Numbers");
		for(int i =1;i<100;i++)
		{
			if (i%2 == 0)
			{
				System.out.print(i+".");
			}
		}
		
		System.out.println("\n\nOdd Numbers");
		
		for(int i =1;i<100;i++)
		{
			if (i%2 != 0)
			{
				System.out.print(i+".");
			}
		}
	}
	
	public void run()
	{
		printNumber();
	}
	
	public static void main(String[] args) {
		
		Q6 obj = new Q6();
		obj.start();
		
	}


}
