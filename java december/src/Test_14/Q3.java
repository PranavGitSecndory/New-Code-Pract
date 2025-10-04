//3.Replace all vowels in a string with ‘*’.
//Input: "hello world" → Output: "h*ll* w*rld"
package Test_14;

public class Q3 {
	static void Replace(String s)
	{
		String k="";
		for (int i = 0; i < s.length(); i++) 
		{
            char ch = s.charAt(i);
        if ("aeiouAEIOU".indexOf(ch) != -1)
		{
			k+='*';
		}
		else
		{
			k+=ch;
		}
		}
		System.out.println("Output: " + k);
	}
public static void main(String[] args) {
	String s="hello world";
	Replace(s);
}
}
