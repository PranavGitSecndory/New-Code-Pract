package String;

public class Question11 {
	static void Q11(String s)
	{
		String s1="";
		for(int i =0; i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(s1.indexOf(ch)==-1)
			{
				s1=s1+ch;
			}	
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		String s="nikhil patil";
		Question11 ob=new Question11();
		ob.Q11(s);
	}
}
