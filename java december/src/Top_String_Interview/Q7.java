//Q7. Print first letter of every word in the string (Zoho)


//Input:
//S = "geeks for geeks"
//Output: gfg
package Top_String_Interview;

public class Q7 {
	public static void main(String[] args) 
	{
	String S = " geeks for geeks";
	String N="";
	 if (S.length() > 0 && S.charAt(0) != ' ') {
         N += S.charAt(0);
     }

     for (int i = 0; i < S.length(); i++)
     {
        
         if (S.charAt(i) == ' ' && i + 1 < S.length())
         {
             N += S.charAt(i + 1);
         }
     }
     System.out.println(N);
}
}
