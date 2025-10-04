//6. Implement a synchronized method that multiplies
//two numbers and prints the result. 
package syncronization;
class mult extends Thread
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
		System.out.println("multiplication of two number is = "+(a*b));
	}
}
public class Q6 {
	public static void main(String[] args) {
		mult ob=new mult();
		ob.start();
}
}
