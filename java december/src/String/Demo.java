package String;

public class Demo
{
	static void Stringprint()
	{
		String s="hello nick";
		String s1=" how are you";
		
		System.out.println(s.length()); //String length
		System.out.println(s.charAt(6));//string char at there position
		System.out.println(s.substring(6));//String particular part print 
		System.out.println(s.substring(6,8));
		
	 	s1 =(s.concat(s1));
	 	System.out.println(s1);//attach the two string 
	 	
	 	System.out.println(s1.toUpperCase());//all string in upper case
	 	System.out.println(s1.toLowerCase());//all string in lower case
	 	
	 	String s2 ="						dj nick";
	 	System.out.println(s2.trim());//trim the spaces in our string
	 	
	 	System.out.println(s1.replace("nick", "sagar"));//replace the char in in our string

	 	System.out.println(s1.startsWith("h"));//String start with check
	 	System.out.println(s1.endsWith("o"));//String end with check
		
	 	char ch[]= {'d','j'};//string array convert to string
	 	char c[]= {1,2,3,4,5};//it is not defined
	 	char ch1[]= s1.toCharArray();//print in array in string
	 	System.out.println(ch);
	 	System.out.println(ch1);
	 	System.out.println();
	 		
	}
	public static void main(String[] args)
	{
		Stringprint();
	}
}
