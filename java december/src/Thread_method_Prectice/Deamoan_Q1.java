//1. Write a Java program to create a daemon thread and
//check if it is a daemon thread using isDaemon().  
package Thread_method_Prectice;
class Question1_demon extends Thread
{
	public void run()
	{
		System.out.println("Deamoan thread");
	}
}
public class Deamoan_Q1 {
public static void main(String[] args) {
	Question1_demon ob=new Question1_demon();
	ob.setDaemon(true);
	if(ob.isDaemon())
	{
		System.out.println("thread is deamoan");
	}
	else
	{
		System.out.println("Thread is not deamoan");
	}
	ob.start();
}
}
