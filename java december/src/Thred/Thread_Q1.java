//1. Create a thread using the Thread class to reverse 
//every word in a string independently
package Thred;
class Thread1 extends Thread
{
	
	public void run()
	{
		String s="nick how are you";
		String a[]=s.split("  ");
	
		for(int i=0; i<a.length; i++)
		{
			char ch[] =a[i].toCharArray();	
			
		for(int j=ch.length-1; j>=0; j--)
		{
			System.out.print(ch[j]);
		}
		System.out.print(" ");
		}
	}
}
public class Thread_Q1 {
public static void main(String[] args) {
	
	
	Thread1 ob=new Thread1();
	ob.start();
	
}
}
