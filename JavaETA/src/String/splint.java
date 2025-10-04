package String;

public class splint {
	public static void main(String[] args) 
	{
		String s="chaina is not good";
		
		String s1[]=s.split("");
		
		/*for(int i=0; i<s1.length; i++)
		{
			System.out.print(s1[i]);
		}
		
		System.out.println();
		
		for(int i=s1.length-1; i>0; i--)
		{
			System.out.print(s.charAt(i));
		}
		*/
		System.out.println();
		
		for(int i=0; i<s1.length; i++)
		{

			for(int j=s1[i].length()-1; j>0; j--)
			{
				System.out.print(s1[i].charAt(i));
			}
			System.out.print("");
		}
		
	}
}
