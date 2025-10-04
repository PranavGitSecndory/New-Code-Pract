//4. Write a Java program to synchronize access to a method 
//that prints numbers from 1 to 10.  
package syncronization;
class Blog4
{
	public synchronized void print()
	{
		System.out.println("print number 1 to 10");
		for(int i=1; i<=10; i++)
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
public class Blog_Q4 extends Thread {

	static Blog4 ob=new Blog4();
	public void run()
	{
		ob.print();
	}
	public static void main(String[] args) {
		Blog_Q4 th=new Blog_Q4();
		Blog_Q4 th1=new Blog_Q4();
		
		th.start();
		th1.start();
		
	}
}
