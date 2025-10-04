package returnt.nopara.pkg;

public class Aramstrong_no {
	public static void main(String args[])
	{
	Aramstrong_no ob=new Aramstrong_no();
	String k=ob.aram();
	System.out.println(k);
	}
	
	public String aram()
	{
		int n=151;
		int rem=0; int sum=0;
		String s1="it is a aarmstrorng ";
		String s2="it is a not aaramstrong";
		
		for(int i=n; i>0; i=i/10 )
		{
			rem=i%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==n)
		{
			return s1;
		}
		else
		{
			return s2;
		}
			
	}		
}
	