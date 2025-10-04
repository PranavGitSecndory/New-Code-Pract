//6. Create a program where multiple threads
//access a shared list, 
package syncronization;
class Blog6
{
	public void display()
	{	
		System.out.println("same blog :"+Thread.currentThread().getName());	
		synchronized (this)
		{
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
public class Blog_Q6 extends Thread{
	static Blog6 ob=new Blog6();
	public void run()
	{
		ob.display();
	}
	public static void main(String[] args) {
		Blog_Q6 th=new Blog_Q6();
		th.start();
		Blog_Q6 th1=new Blog_Q6();
		th1.start();	
	}
}
