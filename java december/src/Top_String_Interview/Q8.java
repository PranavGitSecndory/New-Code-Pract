//Q8 Keypad typing (Microsoft)
//Input:
//S = geeksforgeeks
//Output: 4335736743357
//Explanation:geeksforgeeks is 4335736743357
//in decimal when we type it using the given
//keypad.

package Top_String_Interview;

public class Q8 {
public static void main(String[] args) {
	String S = "geeksforgeeks";
    String[] keypad =
    	{
        "",     
        "",     
        "abc",  
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv",  
        "wxyz"  
    	};
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < S.length(); i++) {
        char ch = S.charAt(i);
        for (int j = 2; j <= 9; j++) {
            if (keypad[j].indexOf(ch) != -1) {
                result.append(j);
                break;
            }
        }
    }
    System.out.println(result.toString());
}
}
