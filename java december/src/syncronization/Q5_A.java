//Create a class Printer with a method printTable(int n)
//that prints multiplication table. Synchronize that method.
package syncronization;

import java.util.Scanner;

class printer extends Thread
{
	int num;
	public printer(int num)
	{
		this.num=num;
	}
	public synchronized void printTable()
	{
		System.out.println("Table of  "+num+"  is = ");
		for(int i=1; i<=10; i++)
		{
		
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);// TODO: handle exception
			}
			System.out.println((i*num));
		}
	}
	public void run()
	{
		printTable();
	}
}
public class Q5_A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of we want table of the number");
	int num =sc.nextInt();
	
	printer ob=new printer(num);
	ob.start();
}
}
