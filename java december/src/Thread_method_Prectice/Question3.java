//3. Implement a thread that simulates a countdown timer 
//from 10 to 1, with a 500ms delay between numbers.  
package Thread_method_Prectice;
class Q3 extends Thread
{
	public void run()
	{
		System.out.println("count down");
		for(int i=10; i>=1; i--)
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
public class Question3 {
public static void main(String[] args) {
	Q3 ob=new Q3();
	ob.start();
}
}
