package Thred;

import java.util.Scanner;

class Book 
{
	int Available_seat=50;
	synchronized void ticket()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many seat want to book");
		int bookseat=sc.nextInt();
		
		try {
			Thread.sleep(1000);
			if(bookseat<=Available_seat)
			{
				Available_seat -=bookseat;
				System.out.println("Seat is booked succesfully");
				System.out.println("remain seat is : "+Available_seat);
			}
			else
			{
				System.out.println("seat not available");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class Bus_tickets extends Thread
{
	static Book a=new Book();
	public void run()
	{
		a.ticket();
	}
	
public static void main(String[] args) {
	Bus_tickets ob1=new Bus_tickets();
	Bus_tickets ob2=new Bus_tickets();
	Bus_tickets ob3=new Bus_tickets();
	ob1.start();
	ob2.start();
	ob3.start();
	
}
}
