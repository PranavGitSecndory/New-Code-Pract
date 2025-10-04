package String;
import java.util.Arrays;
public class methods {
	public static void main(String args[])
	{
		String str ="java is don";
		
		char c[]=str.toCharArray();//char string convert to array
		
		System.out.println(Arrays.toString(c));
		
		System.out.println();
		
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
			
		System.out.println(str.substring(0,4));
		
		System.out.println(str.substring(5));
}
}
