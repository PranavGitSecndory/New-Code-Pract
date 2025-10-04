package Exception;
public class demo {
	public static void main(String[] args) {
		String s="nick";
		int a[]= {1,2};
		System.out.println(s);
		System.out.println(23);
		System.out.println(35);
		try
		{
			System.out.println(s.charAt(4443));	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{	
			System.out.println(a[5]);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(46);
		System.out.println(344);
	}
}
