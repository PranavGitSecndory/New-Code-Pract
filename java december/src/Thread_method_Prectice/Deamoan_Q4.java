// 6. Write a Java program where a non-daemon thread continues
// execution after the main thread exits.  
package Thread_method_Prectice;
class Question6_deamon extends Thread
{
	public void run()
	{
		  System.out.println("Main thread ends.");
	}
}
public class Deamoan_Q4 {
public static void main(String[] args) {
	Question6_deamon ob=new Question6_deamon();
	for (int i = 1; i <= 5; i++) 
	{
        System.out.println("Worker thread running: " + i);
        try 
        {
            Thread.sleep(1000); 
        } catch (Exception e) 
        {
          e.printStackTrace();
        }
    }
   
    ob.start();
}
}
