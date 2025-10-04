package Thread_method_Prectice;
/*
 1.single task by single thread
 2.single task by multiple thread
 3.multiple task multiple thread
 4.multiple task single thread
 */
class single extends Thread
{
	public void run()
	{
		System.out.println("mult  task 1 multiple thread");
	}
}
class mult extends Thread
{
	public void run()
	{
		System.out.println("mult  task 2 multiple thread");
	}
}
public class MultyTbhread_demo {
public static void main(String[] args)
{
	single ob=new single();
	ob.start();
	mult ob1=new mult();
	ob1.start();
}
}
