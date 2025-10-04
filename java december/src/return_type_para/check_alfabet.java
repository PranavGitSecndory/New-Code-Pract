package return_type_para;
import java.util.Scanner;
public class check_alfabet {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		check_alfabet ob=new check_alfabet();
		System.out.println("enter the alpaber");
		char ch=sc.next().charAt(0);
		
		String l=ob.check(ch);
		System.out.println(l);
	}
	String check(char c)
	{
		
		if((c>= 65 && c<=90) || (c>=97 && c<=122))
		{
		return "it is alfebt";
		}
		else
		{
			return "it is not alfa";
		}
	}
	
}
