
//Q4. Front-Back Transformation - copy (Microsoft)

//Input: S = "Hello"
//Output: Svool
//Explanation: 'H' is the 8th letter from the
//beginning of alphabets, which is replaced by
//'S' which comes at 8th position in reverse order
//of alphabets. Similarly, all other letters are
//replaced by their respective upper or lower case
//letters accordingly.
package Top_String_Interview;

public class Q4 {
public static void main(String[] args) {
	String s="Hello";
	s =s.toLowerCase();
	
	String K="";
	
	for(int i=0;i<s.length(); i++)
	{
		char ch=s.charAt(i);
	
		if (ch >= 'a' && ch <= 'z') 
		{
            char ch1 = (char) ('z' - (ch - 'a'));
            K = K + ch1;
		}
		else 
		{
            K = K + ch;
        }
	}
	System.out.println(K);
}
}
