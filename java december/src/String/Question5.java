//5.enter a string and count the no of vowel and consonent.
package String;
import java.util.Scanner;
public class Question5 {
	static void Q6()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		int v=0;
		int c=0;
		for(int i=0; i<s.length(); i++)
		{
			if('a'==s.charAt(i) || 'e' ==s.charAt(i) || 'i'==s.charAt(i) || 'o' ==s.charAt(i) ||'u'==s.charAt(i) )
			{
				v++;
			}
			else if(s.charAt(i) == ' ' )
			{
				continue;
			}
			else
			{
			c++;
			}
		}
		System.out.println("vovel count in string is = "+v);
		System.out.println("constont count in string is = "+c);
	}
	public static void main(String[] args) {
		Q6();
	}

}
