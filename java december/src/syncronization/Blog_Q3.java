//3. Implement a class where two threads try to update
// a shared variable using a synchronized block.  
package syncronization;
class blog3
{
	public void counter()
	{
		synchronized (this)
		{
			System.out.println("counter is :");
			for(int i=1; i<=5; i++)
			{
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			
			}
		}
	}
	}
public class Blog_Q3 implements Runnable{
	static blog3 ob=new blog3();
	public void run()
	{
		ob.counter();
	}
	public static void main(String[] args) {
		Blog_Q3 th=new Blog_Q3();
		Thread thh=new Thread(th);
		thh.start();
		
		Blog_Q3 th1=new Blog_Q3();
		Thread thh1=new Thread(th1);
		thh1.start();
		
	}
}
