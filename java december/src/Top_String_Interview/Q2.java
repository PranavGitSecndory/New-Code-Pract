//
//Q2. Delete alternate characters (Amazon)
//Input: S = "Geeks"
//Output: "Ges"
//Explanation: Deleted "e" at index 1
//and "k" at index 3.

package Top_String_Interview;

public class Q2 {
public static void main(String[] args) {
	String S= "Geeks";
	for(int i=0; i<S.length(); i++)
	{
		if(i%2==0)
		{
			System.out.print(S.charAt(i));
		}
	}
}
}
