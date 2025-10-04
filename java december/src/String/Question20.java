//Q20.Wap enter a string and find the count of white space.
package String;

public class Question20 {
	static void Q20()
	{
		String s="  nikhil  patil  ";
		int count =0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
			count++;
			}
		}
		System.out.println("count of white spaces is = "+count);
	}
public static void main(String[] args) {
	Q20();
}
}
