//Print even and odd numbers using two synchronized 
//methods called by two threads.
package syncronization;
class Evenodd extends Thread
{
	public synchronized void even()
	{
		System.out.println("even number = ");
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
			
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println(i);
			}
		}
	}
	public synchronized void odd()
	{
		System.out.println("odd number = ");
		for(int i=1; i<=10; i++)
		{
			if(i%2==1)
			{
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println(i);
			}
		}
	}
	public void run()
	{
		even();
		odd();
	}
}
public class Q4_a extends Thread {

public static void main(String[] args) {
	Evenodd ob=new Evenodd();
	ob.start();

}
}
