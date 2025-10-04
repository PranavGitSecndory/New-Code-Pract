//3. Write a program where a daemon thread runs in 
//the background while the main thread performs a task.  
package Thread_method_Prectice;
class Question2_deamon extends Thread
{
	public void run()
	{
		System.out.println("deamoan run");
	}
}
public class Demoad_Q3 {
public static void main(String[] args) {
	Question2_deamon ob=new Question2_deamon();
	ob.setDaemon(true);
	ob.start();
	for(int i=1; i<=5; i++)
	{
		System.out.println("main thread =  "+i);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
	e.printStackTrace();
		}
	}
	
}
}
