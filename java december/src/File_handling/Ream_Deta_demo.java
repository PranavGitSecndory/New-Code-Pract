package File_handling;

import java.io.File;
import java.util.Scanner;

public class Ream_Deta_demo {
public static void main(String[] args) {
	try 
	{
		File ob= new File("C:\\Users\\patil\\OneDrive\\Desktop\\File_handle\\ketan\\");
		Scanner sc= new Scanner(ob);
		StringBuffer sb =new StringBuffer();
		
		while(sc.hasNextLine())
		{
			sb.append(sc.nextLine());
		}
		String s =String.valueOf(sb);
		String str[]=s.split(" ");
		
		System.out.println(sb);
		System.out.println(str.length);
		
		for(int i=0; i<str.length; i++)
		{
			System.out.println(Character.toUpperCase(str[i].charAt(0))+""+str[i].substring(1));
		}
		
	} 
	catch (Exception e) 
	{
		System.out.println(e);
	}
}
}
