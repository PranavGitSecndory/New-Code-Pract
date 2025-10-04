//2. Write a synchronized method that increments a counter
//and prints its value. 
package syncronization;
class Counter {
    int count = 0;

    synchronized void increment() {
    	for(int i=1; i<=5; i++)
    	{
    		try {
    			Thread.sleep(1000);
				
			} catch (Exception e) {
			System.out.println(e);
			}
    		count++;
            System.out.println("Counter value: " + count);
    	}
        
    }
}
public class Q2 extends Thread
{
	Counter a=new Counter();
	public void run()
	{
		a.increment();
	}
	 public static void main(String[] args) {
	       Q2 ob=new Q2();
	       ob.start();
}
}