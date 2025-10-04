//Q9. Change the string (yahoo)
//Input:
//
//S = "abCD"
//Output: abcd
//Explanation: The first letter (a) is
//lowercase. Hence, the complete string
//is made lowercase.

package Top_String_Interview;

public class Q9 {
public static void main(String[] args) {
	String s="AbcD";

	if(Character.isLowerCase(s.charAt(0)))
	{
		System.out.println(s.toLowerCase());
	}
	else
	{
		System.out.println(s.toUpperCase());
	}
}
}
