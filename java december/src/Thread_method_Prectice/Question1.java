//1. Write a program where a thread prints numbers 
//from 1 to 5, with a 1-second delay between each print using sleep.  
package Thread_method_Prectice;
class Q1 extends Thread
{
	public void print()
	{
		System.out.println("thraed is satart");
		for(int i=1; i<=5; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public void run()
	{
		print();
	}
}
public class Question1 {
public static void main(String[] args) {
	Q1 ob=new Q1();
	ob.start();
}
}
