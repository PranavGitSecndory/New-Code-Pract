
package String;

public class Question8 {
	static void Q8()
	{
		String s="nikhil";
		System.out.println("even position element is");
		for(int i=0; i<s.length(); i++ )
		{
			if(i%2==1)
			{
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		System.out.println("odd poisition element is");
		for(int i=0; i<s.length(); i++ )
		{
			if(i%2==0)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
public static void main(String[] args) {
	Q8();
}
}
