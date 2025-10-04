package syncronization;
class Shread 
{
	 synchronized void print()
	{
		for(int i=1; i<=5; i++)
		{
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
		e.getStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Syncronization_demo extends Thread
{
	static Shread p;
	public void run()
	{
		p.print();
	}
public static void main(String[] args) {
	p=new Shread();
	
	Syncronization_demo ob=new Syncronization_demo();
	ob.start();
	Syncronization_demo ob1=new Syncronization_demo();
	ob1.start();
	Syncronization_demo ob2=new Syncronization_demo();
	ob2.start();
}
}
