
package syncronization;
class blog
{
	void print()
	{
		System.out.println("some random text"+Thread.currentThread().getName());
		System.out.println("some random text"+Thread.currentThread().getName());
		System.out.println("some random text"+Thread.currentThread().getName());
		System.out.println("some random text"+Thread.currentThread().getName());

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
	System.out.println("some random text"+Thread.currentThread().getName());
	System.out.println("some random text"+Thread.currentThread().getName());
	System.out.println("some random text"+Thread.currentThread().getName());
	System.out.println("some random text"+Thread.currentThread().getName());

	}
}
public class Blog_syncronization_demo extends Thread {
	static blog ob=new blog();
	public void run()
	{
		ob.print();
	}
public static void main(String[] args) {
	
	Blog_syncronization_demo th=new Blog_syncronization_demo();
	Blog_syncronization_demo th1=new Blog_syncronization_demo();
	Blog_syncronization_demo th2=new Blog_syncronization_demo();
	th.start();
	th1.start();
	th2.start();
	
}
}
