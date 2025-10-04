//2. Create a program where multiple threads increment a 
//shared counter using a synchronized block.  
package syncronization;
class blog2
{
	public void counter()
	{
		synchronized (this)
		{
			System.out.println("counter is :");
			for(int i=1; i<=5; i++)
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
	}
public class Blog_Q2 extends Thread
{
	static blog2 ob=new blog2();
	public void run()
	{
		ob.counter();
	}
	public static void main(String[] args) {
		Blog_Q2 th=new Blog_Q2();
		Blog_Q2 th1=new Blog_Q2();
		Blog_Q2 th2=new Blog_Q2();
		th.start();
		th1.start();
		th2.start();
	}
}
