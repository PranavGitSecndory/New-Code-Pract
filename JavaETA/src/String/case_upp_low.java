package String;

public class case_upp_low {
	public static void main(String args[])
	{
		String str =new String("nick");
		String str1 = str.toUpperCase();
		System.out.println(str1);
		
		String str2 =new String("NICk");
		String str3 = str.toLowerCase();
		System.out.println(str3);
		
		String str4 =new String("NICk");
		String str5 = new String("sagar");
		String str6 =str.concat(str5);
		System.out.println(str6);
		
		
	System.out.println(str.indexOf('i'));
	System.out.println(str.lastIndexOf('k'));
	
	String s="java";
	s= s.trim();
	System.out.println(s+" program");
	
	String s1 ="java is a sinmpkle";
	
	s1= s1.replace("java", "nick");
	System.out.println(s1);
	
	System.out.println(str1.length());
	
	
	String t ="java is a simple";
	
		
	}
}
