package Exception;

public class All_Demo_exception {
public static void main(String[] args) {
	String a="nick";
	int b[]= {1,3,4,5};
	System.out.println(50);
	System.out.println(5);
	System.out.println(a);
	System.out.println(b[2]);
	try
	{
	System.out.println(200/0);
	//	System.out.println(a.charAt(200));
	//	System.out.println(b[20]);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e+" = arrathmatic exeption");
//		try {
//			System.out.println(300/0);
//		}
//		catch(Exception k)
//		{
//			System.out.println(k+" = inner Exception");
//		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e+" = array out of bounds");
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(e+" = String out of bond");
	}
	catch(Exception e)
	{
		System.out.println(e+" = parent exeption call");
	}
	System.out.println(500);
	System.out.println(5000);
	
	
}
}
