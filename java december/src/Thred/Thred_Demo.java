package Thred;
class Thred extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.print(i+" ");
		}
	}
}
public class Thred_Demo {
public static void main(String[] args) {
	Thred ob=new Thred();
	ob.start();
}
}
