package Exception;
class Current extends Thread
{
	public void run()
	{
		System.out.println("curent thread = "+Thread.currentThread().getName());
	}

}
public class Current_Thread {
public static void main(String[] args)
{

	Current ob =new Current();
	Current ob1 =new Current();
	
	ob.start();
	try {
		ob.join();
	} catch (Exception e) {
		e.printStackTrace();
	}
	ob1.start();
	
	
}
}
