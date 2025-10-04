//9. Implement a synchronized method that prints "Start",
//waits for 2 seconds, and then prints "End". 
package syncronization;
class printt extends Thread
{
	public synchronized void run()
	{
		System.out.println("Start");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		System.out.println(e);
		}
		System.out.println("End");
	}
}
public class Q9 {
public static void main(String[] args) {
	printt ob=new printt();
	ob.start();
}
}
