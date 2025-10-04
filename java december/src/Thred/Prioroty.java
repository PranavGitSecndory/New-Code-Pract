package Thred;
class Thread11 extends Thread
{
	public void run()
	{
		System.out.println("thread is = "+Thread.currentThread().getName());
	}
}
public class Prioroty
{
public static void main(String[] args)
{
	Thread11 ob=new Thread11();
	Thread11 ob1=new Thread11();
	Thread11 ob2=new Thread11();
	Thread11 ob3=new Thread11();
	
	ob1.setPriority(Thread.NORM_PRIORITY);
	ob2.setPriority(Thread.MAX_PRIORITY);
	ob3.setPriority(Thread.MIN_PRIORITY);
	ob.setPriority(2);
	
	ob.start();
	ob1.start();
	ob2.start();
	ob3.start();
}
}
