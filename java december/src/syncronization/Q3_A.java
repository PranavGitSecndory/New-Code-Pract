//Create a class Counter with a method increment()
//that increases a counter. Make it thread-safe.
package syncronization;
class Count1 extends Thread
{
	public void increment()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thread counter "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	public void run()
	{
		increment();
	}
}
public class Q3_A  {
public static void main(String[] args) {
	Count1 ob=new Count1();
	
	ob.start();
	
}
}
