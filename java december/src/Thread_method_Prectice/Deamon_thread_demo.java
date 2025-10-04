package Thread_method_Prectice;
class Deamont extends Thread
{
	public void run()
	{
		System.out.println("hello nick");
	}
}
public class Deamon_thread_demo {
public static void main(String[] args) {
	Deamont ob=new Deamont();
	System.out.println(ob.isDaemon());
	ob.setDaemon(true);
	System.out.println(ob.isDaemon());
	ob.start();
	
}
}
