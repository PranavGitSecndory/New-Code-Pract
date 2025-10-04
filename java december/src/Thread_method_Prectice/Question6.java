//6. Write a program where a thread sleeps for 
//3 seconds and then prints a message.  
package Thread_method_Prectice;
class Q6 extends Thread
{
	public void print()
	{
		try {
			Thread.sleep(3000);
			
		} catch (Exception e) {
	e.printStackTrace();
		}
		System.out.println("Hello World after 3 sec...");
	}
	public void run()
	{
		print();
	}
}
public class Question6 {
public static void main(String[] args) {
	Q6 ob=new Q6();
	ob.start();
			
}
}
