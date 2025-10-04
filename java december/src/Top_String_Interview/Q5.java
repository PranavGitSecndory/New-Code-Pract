//Q5. Uncommon characters (Zoho)

//Input:
//A = geeksforgeeks
//B = geeksquiz
//Output: fioqruz
//Explanation:
//
//The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
//are either present in A or B, but not in both.
package Top_String_Interview;

public class Q5 {
public static void main(String[] args) {
	String A = "geeksforgeeks";
	String B = "geeksquiz";
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

