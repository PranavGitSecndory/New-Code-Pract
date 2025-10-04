package String;

public class PracticeQ5_Q6 {
	static void Q5_Q6(String s)
	{
		String s1="";
		for(int i=0; i<s.length(); i++)
		{
			char ch =s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				s1=s1+(char)(ch-32);
			}
		}
		System.out.println("uppercase without method = "+s1);
	}
	
	static void Q5_Q6(String s,int a)
	{
		String s1="";
		for(int i=0; i<s.length(); i++)
		{
			char ch =s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				s1=s1+(char)(ch+32);
			}
		}
		System.out.println("lowercase without method = "+s1);
	}
public static void main(String[] args) {
	PracticeQ5_Q6 ob=new PracticeQ5_Q6();
	ob.Q5_Q6("nikhil");
	ob.Q5_Q6("SAGAR",1);
	
	
	
}
}
