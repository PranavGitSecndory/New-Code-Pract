//1. Write a Java program to demonstrate a synchronized 
//block inside a method.  
package syncronization;
class blog1
{
	void print()
	{
		System.out.println("thread is "+Thread.currentThread().getName());
		synchronized(this)
		{
			for(int i=1; i<=5; i++)
			{
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println(Thread.currentThread().getName());
			}

		}
	}
}
public class Blog_Q1 extends Thread {
	static blog1 ob=new blog1();
	public void run()
	{
		ob.print();
	}
public static void main(String[] args) {
	Blog_Q1 th=new Blog_Q1();
	th.start();
}
}
	
