//Q17.Wap enter a string and check any particular string are present in it or not using contains().
package String;

public class Question17 {
	static void Q17()
	{
		String s="nick how are you";
		String s1="patil good";
		if(s.contains(s1))
		{
			System.out.println("string contain the"+s1);
		}
		else
		{
			System.out.println("String is not containt = "+s1);
		}
	}
public static void main(String[] args) {
	Q17();
	
}
}
