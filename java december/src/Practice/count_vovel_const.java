package Practice;
import java.util.Scanner;
public class count_vovel_const {
	void count(String str)
	{
		int vcount=0;
		int ccount=0;
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch =='A'|| ch =='E'||ch=='I'||ch=='O'||ch=='U'||
					ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		System.out.println("count of vovel is = "+vcount);
		System.out.println("count of const  is = "+ccount);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	count_vovel_const ob =new count_vovel_const();
	System.out.println("enter the string");
	String str=sc.nextLine();
	ob.count(str);
	
}
}
