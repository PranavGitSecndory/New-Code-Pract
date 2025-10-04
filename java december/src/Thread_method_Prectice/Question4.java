//4. Write a program where two threads print alternate numbers
//from 1 to 10 with sleep delays.  
package Thread_method_Prectice;
class Q4 extends Thread
{
	public void oddprint()
	{
		try {
			for(int i=1; i<=10; i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void evenprint()
	{
		try {
			for(int i=1; i<=10; i++)
			{
				if(i%2==1)
				{
					System.out.println(i);
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void run()
	{
		oddprint();
		evenprint();
	}
}
public class Question4 {
public static void main(String[] args) {
	Q4 ob=new Q4();
	Q4 ob1=new Q4();
	ob.start();
	ob1.start();
}
}
