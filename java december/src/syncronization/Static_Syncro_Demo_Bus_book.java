package syncronization;
class Booking
{
	static int tseat= 25;
	static synchronized void bookseat(int seat)
	{
		if(tseat>=seat)
		{
			tseat-=seat;
			System.out.println("Seat succesfully book");
			System.out.println("avalible seat is :"+tseat);
		}
		else
		{
			System.out.println("seat not avalible");
			System.out.println("total seat are :"+tseat);
		}
	}
}

class Thread1 extends Thread
{
   static Booking b ;
   int seats;
   
   Thread1(Booking b , int seats)
   {
       this.b=b;
       this.seats=seats;
   }
   
   

   public void run()
   {
       b.bookseat(seats);
   }
   
   
}


class MyThread2 extends Thread
{
   static Booking b ;
   int seats;
   
   MyThread2(Booking b , int seats)
   {
       this.b=b;
       this.seats=seats;
   }
   
   public void run()
   {
       b.bookseat(seats);
   }   
}

public class Static_Syncro_Demo_Bus_book extends Thread{
	 public static void main(String[] args) {
		Booking ob = new Booking();
		MyThread2 t1=new MyThread2(ob,10);
		MyThread2 t2=new MyThread2(ob,8);
		t1.start();
		t2.start();
		
		Booking ob1=new Booking();
		MyThread2 t3=new MyThread2(ob1,5);
		MyThread2 t4 =new MyThread2(ob1,4);
		t3.start();
		t4.start();
		
	}
	
}
