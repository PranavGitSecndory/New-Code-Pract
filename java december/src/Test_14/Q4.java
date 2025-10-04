//4.Reverse each word in a sentence individually.
//Input: "Java is fun" → Output: "avaJ si nuf"
package Test_14;

public class Q4 {
	static void reverse(String s)
	{
		String a[]=s.split(" ");
		String r="";
		for(int i=0; i<a.length; i++)
		{
			String b=a[i];
			String k="";
			
			  for (int j = b.length() - 1; j >= 0; j--) 
			  {
	                k += b.charAt(j);
			  }
			  r+=k+" ";
		}
		System.out.println("output :"+r.trim());
	}
public static void main(String[] args) {
	String s="Java is fun";
	reverse(s);
}
}
