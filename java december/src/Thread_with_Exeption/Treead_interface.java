package Thread_with_Exeption;
class Thread1 implements Runnable
{
	public void print()
	{
		for(int i=1;i<=20; i++)
		{
			System.out.print(i+" ");
		}
	}
	@Override
	public void run() 
	{
	print();
	}
}
public class Treead_interface {
public static void main(String[] args) {
	Thread1 th=new Thread1();
	Thread ob=new Thread(th);
	ob.start();
}
}
