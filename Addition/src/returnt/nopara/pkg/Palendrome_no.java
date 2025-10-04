package returnt.nopara.pkg;

public class Palendrome_no {

	public static void main(String[] args) {
		
		Palendrome_no ob=new Palendrome_no();
		String k=ob.Pal();
		System.out.println(k);
		
	}
	
	public String Pal()
	{
		int n=121;
		int k=n;
		int rev=0,rem=0;
		String s1="no is plandrome";
		String s2="no is not plandrome";
		
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
			
			if(rev==k)
			{
				return s1;
			}
			else
			{
				return s2;
			}
	}
}
