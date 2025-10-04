package Test_15;

public class Q6 extends Thread{
	void evenodd()
	{
		System.out.println("even number =");
		for(int i=1; i<=20; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+",");
			}
		}
		System.out.println("\nodd number =");
		for(int i=1; i<=20; i++)
		{
			if(i%2==1)
			{
				System.out.print(i+",");
			}
		}
	}
	public void run()
	{
		evenodd();
	}
public static void main(String[] args) {
	Q6 ob=new Q6();
	ob.start();
}
}
