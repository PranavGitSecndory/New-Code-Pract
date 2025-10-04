package return_type_para;

public class palendrome {
	
	String palen(int a)
	{
		String s="pllendrome";
		int rem=0; 
		for(int i=a; i>0; i=i/10)
		{
			int rev=i%10;
			rem=rem*10+rev;
		}
		if(rem==a)
		{
			return s;
		}
		else
		{
			return "not pallendrome";
		}
	}
	
	public static void main(String [] args)
	{
		palendrome ob=new palendrome();
		
		String k=ob.palen(121);
	
		System.out.println(k);
		
	}
}
