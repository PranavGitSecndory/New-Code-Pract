package String;

public class Question13 {
	static void Q13(String s)
	{
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
public static void main(String[] args) {
	String s="nikhil";
	Question13 ob=new Question13();
	ob.Q13(s);
}
}
