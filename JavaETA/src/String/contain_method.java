package String;

public class contain_method {
	public static void main(String args[])
	{
		String str = "java is a language";
		
		String s= "java";
		
		if(str.contains(s))
		{
			System.out.println("it is present");
		}
		else
		{
			System.out.print("it is not present");
		}
		
	
		String str1 = str.toUpperCase();
		System.out.println(str1);
		
	
		String str3 = str.toLowerCase();
		System.out.println(str3);
		
	
		s= s.trim();
		System.out.println(s+" program");
		
		
	}
}
