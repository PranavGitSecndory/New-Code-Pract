//Create a class with two threads that access a common
//object with a synchronized block inside a method.
package syncronization;
class share
{
	 void display(String name) {
	        synchronized (this) {
	            for (int i = 1; i <= 3; i++) {
	                System.out.println(name + " - " + i);
	                try {
	                    Thread.sleep(300);
	                } catch (Exception e) {
	                    System.out.println(e);
	                }
	            }
	        }
	    }
}
class comon extends Thread
{
	share obb;
	String th;
	comon (share obb, String th)
	{
		this.obb=obb;
		this.th=th;
	}
	public void run()
	{
		obb.display(th);
	}
}
public class Q6_A {
	public static void main(String[] args) {
		
	share obb= new share();
	comon ob=new comon(obb,"thread 1");
	comon ob1=new comon(obb,"Thread 2");
	ob.start();
	ob1.start();
}
}
