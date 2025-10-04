//Q6. Remove common characters and concatenate (Oracle)
//Input:
//s1 = aacdb
//s2 = gafd
//Output: cbgf
//Explanation: The common characters of s1
//and s2 are: a, d. The uncommon characters
//of s1 and s2 are c, b, g and f. Thus the
//modified string with uncommon characters
//concatenated is cbgf.
package Top_String_Interview;

public class Q6 {
	public static void main(String[] args) {
		
	
	String A = "aacdb";
	String B = "gafd";
	String C="";
	
	for(int i=0; i<A.length(); i++)
	{
		char ch= A.charAt(i);
		if(B.indexOf(ch) == -1 && C.indexOf(ch) == -1)
		{
			C+=ch;
		}
		
	}
	for(int j=0; j<B.length(); j++)
	{
		char ch1 =B.charAt(j);
		if(A.indexOf(ch1) == -1 && C.indexOf(ch1)== -1)
		{
			C+=ch1;
		}	
	}

System.out.println(C);
	}
}
