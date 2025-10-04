//Q21. Wap enter a string and print all duplicate character.
package String;
public class Question21 {
	static void Q21()
	{
		String s="nikhillk";
		char ch[]=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("duplecate charcter is = "+ch[j]);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Q21();
	}
}
