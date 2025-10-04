//8. Write a synchronized method that prints even numbers from 2 to 10.  
package syncronization;
class even extends Thread
{
	public synchronized void run()
	{
		System.out.println("even number between 2 to 10 is = ");
		for(int i=2; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				System.out.println(e);
				}
			}
		}
	}
}
public class Q8 {
public static void main(String[] args) {
	even ob=new even();
	ob.start();
}
}
