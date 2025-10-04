//7.Write a Java program to compare two strings using equalignore case.
package String;

public class Question7 {
	static void Q7()
	{
		String s1= new String("patil");
		String s="Nikhil";
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("both string are equal");
		}
		else
		{
			System.out.println("both string are not equal");
		}	
	}
	public static void main(String[] args) 
	{
				Q7();
	}
}
