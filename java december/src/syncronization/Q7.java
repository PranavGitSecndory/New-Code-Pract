//7. Create a class with a synchronized method that prints 
//"Thread is running" five times.  
package syncronization;
class running extends Thread
{
	public synchronized void run()
	{
	for(int i=1; i<=5; i++)
	{
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	System.out.println("Thread is running");
	}
	}
}
public class Q7 {
public static void main(String[] args) {
	running ob=new running();
	ob.start();
}
}

