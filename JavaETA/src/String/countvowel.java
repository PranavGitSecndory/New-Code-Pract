package String;
import java.util.Scanner;
public class countvowel {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the string");
		String str =sc.nextLine();
		
		int cvov=0, cntc=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)== 'a' || str.charAt(i)== 'e' ||str.charAt(i)== 'i' ||str.charAt(i)== 'o' ||str.charAt(i)== 'u' )
			{
				cvov++;
			}
			else
			{
				cntc++;
			}
		}
		System.out.println("vovel no is="+cvov);
		System.out.println("consonent is="+cntc);
		
	}
}
