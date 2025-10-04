//5. Write a class with a synchronized method that adds 
//two numbers and prints the sum.  
package syncronization;
class sum extends Thread
{
	public synchronized void run()
	{
		int a=10;
		int b=20;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("aDd of two number is = "+(a+b));
	}
}
public class Q5 {
public static void main(String[] args) {
	sum ob=new sum();
	ob.start();
}
}
