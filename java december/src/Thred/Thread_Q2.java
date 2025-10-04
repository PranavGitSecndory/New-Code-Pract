//2. Create a thread using the Thread class to count vowels in 
//each word of a sentence using multiple threads  
package Thred;
class Countvovel extends Thread
{ 
	private String s;
	
	public Countvovel(String s)
	{
		this.s=s;
	}
	
	public void count()
	{
		int count =0;
		char ch[]=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			
			if ("aeiou".indexOf(ch[i]) != -1)
			{
                count++;
            }
			
		}
		 System.out.println("Word: " + s + " -> Vowel count: " + count);
	}
	public void run()
	{
		count();
	}
}
public class Thread_Q2 {
public static void main(String[] args) {
	String a="how are you nick";
	String s1[]=a.split(" ");
	
	for(int i=0; i<s1.length; i++)
	{
	Countvovel ob =new Countvovel(s1[i]);
	ob.start();
	}
	
}
}
