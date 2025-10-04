//1. Create a class with a synchronized method that prints 
//"Hello" five times.  
package syncronization;
class helloprint extends Thread
{
	synchronized void print()
	{
		for(int i=1; i<=5; i++)
		{
		try {
			Thread.sleep(1000);	
		} catch (Exception e) {
			System.out.println(e);
		}
			System.out.println("hello");
		}
	}
	public void run()
	{
		print();
	}
}
public class Q1 {
	
	public static void main(String[] args) {
		helloprint ob=new helloprint();
		ob.start();
	}

}
