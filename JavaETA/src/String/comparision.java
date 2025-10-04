package String;

public class comparision {
	public static void main(String args[])
	{
		String str = "java";
		String str1 = "java";
		
		String s1 = new String("java");
		String s2 = new String("java");
		

		
		if(s1 == s2)//false
		{
			System.out.println("both equal");
		}
		else
		{
			System.out.println("both not equal");
		}
	

	//equals() method it cheack cnclr=ent of twon string
	//== : is a cheack referance of two strings
	// compareTo()	: it interanally worlk lexicographically

	String st1 = new String("nick");
	String st2 = new String("nick");
	
	if(st1.compareTo(st2)>0)
	{
		System.out.println("first is greter");
	}
	else if(st1.compareTo(st2)<0)
	{
		System.out.println("second is greter");
	}
	else
	{
		System.out.println("its equals");
	}

}
	
}