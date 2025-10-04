package Exception;
class sleep extends Thread
{
	public void display() throws InterruptedException
	{
		System.out.println("thraed is satart");
		for(int i=1; i<=5; i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}
	}

	public void run()
	{
		try {
			display();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	
	
	
	}
}
public class Sleep_method {
public static void main(String[] args) {
	sleep ob=new sleep();
	ob.start();
}
}
