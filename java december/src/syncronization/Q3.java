//3. Implement a synchronized method that prints numbers from 1 to 5. 
package syncronization;
class number 
{
	synchronized void prints()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" = "+i);
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		
		}
	}
}
public class Q3 extends Thread {
	static number ob=new number();
	public void run()
	{
		ob.prints();
	}
public static void main(String[] args) {
	
	
	Q3 th=new Q3();
	th.start();
}
}
