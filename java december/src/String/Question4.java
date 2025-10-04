package String;
import java.util.Scanner;
public class Question4 {
	static void Q4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		System.out.println("search particuler char");
		char ch=sc.next().charAt(0);
		
		for(int i=0; i<s.length(); i++)
		{
			if(ch==s.charAt(i))
			{
				System.out.println("charector is present and index is  = "+i);
			}	
		}
		System.out.println("char is not present");
		
	}
	public static void main(String[] args) 
	{	
		Q4();
	}
}
