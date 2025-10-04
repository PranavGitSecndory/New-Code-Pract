//5. Create a thread using the Thread class to find 
//all palindromic substrings in a string concurrently  
package Thred;
class Pallen extends Thread
{
	private String s;
	public Pallen(String s)
	{
		this.s=s;
	}
	
	public void check()
	{
		String s1="";
		for(int i=s.length()-1; i>=0; i--)
		{
			s1+=s.charAt(i);
		}
		if(s1.equals(s))
		{
			System.out.println("String is a palindromic");
		}
		else
		{
			System.out.println("String is nor pallaendronic");
		}

	}
	public void run()
	{
		check();
	}
}
public class Thread_Q5 {
public static void main(String[] args) {
	Pallen ob=new Pallen("madam");
	ob.start();
}
}
