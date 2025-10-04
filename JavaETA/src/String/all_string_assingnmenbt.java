package String;
import java.util.Scanner;
public class all_string_assingnmenbt {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println("Even");
		for(int i=0; i<str.length(); i++)
		{
			if(i%2==0)
			{
				System.out.println(str.charAt(i));
			}
			
		}
		System.out.println("Odd");
		for(int i=0; i<str.length(); i++)
		{
			if(i%2!=0)
			{
				System.out.println(str.charAt(i));
			}
		}
		
	}

}
