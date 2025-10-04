//2. Create a program where multiple threads print their
//names but pause for different durations using sleep.  
package Thread_method_Prectice;
class Q2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class Question2 {
public static void main(String[] args) {
	Q2 ob =new Q2();
	Q2 ob1 =new Q2();
	Q2 ob2 =new Q2();
	Q2 ob3 =new Q2();
	ob.start();
	try {
		Q2.sleep(1000);
	} catch (Exception e) {
	System.out.println(e);
	}
	ob1.start();
	try {
		Q2.sleep(1000);
	} catch (Exception e) {
	System.out.println(e);
	}
	ob2.start();
	try {
		Q2.sleep(1000);
	} catch (Exception e) {
	System.out.println(e);
	}
	ob3.start();
	try {
		Q2.sleep(1000);
	} catch (Exception e) {
	System.out.println(e);
	}
}
}
