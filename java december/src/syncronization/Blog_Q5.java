//5. Demonstrate how a synchronized block can be used
//inside a loop to ensure thread safety.  
package syncronization;
class Blog5
{
	public void display()
	{	
			for(int i=1; i<=5; i++)
			{
				synchronized (this)
				{
					System.out.println("current thread :"+Thread.currentThread().getName());	
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
	}
	}
}
public class Blog_Q5 extends Thread{
	static Blog5 ob=new Blog5();
	public void run()
	{
		ob.display();
	}
	public static void main(String[] args) {
		Blog_Q5 th=new Blog_Q5();
		th.start();
		Blog_Q5 th1=new Blog_Q5();
		th1.start();	
	}
}
