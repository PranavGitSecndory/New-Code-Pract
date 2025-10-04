//5. Delete consecutive same words in a sequence

//
//Input : ab aa aa bcd ab
//Output : 3
//As aa, aa destroys each other so, 
//ab bcd ab is the new sequence.
//
//Input :  tom jerry jerry tom
//Output : 0
//
//As first both jerry will destroy each other.
//Then sequence will be tom, tom they will also destroy
//each other. So, the final sequence doesn’t contain any
//word.
package stack;

import java.util.Stack;

public class Dlt_Same_Words {
	 public static int count(String s)
	 {
	        Stack<String> ob = new Stack<>();
	        String[] words = s.split(" ");

	        for (int i = 0; i < words.length; i++)
	        {
	            String word = words[i];

	            if (!ob.isEmpty() && ob.peek().equals(word)) 
	            {
	                ob.pop();
	            } 
	            else 
	            {
	                ob.push(word); 
	            }
	        }

	        return ob.size(); 
	    }
	 public static void main(String[] args) 
	 {
	        String s = "tom jerry jerry tom"; 
	        String s1 =  "ab aa aa bcd ab";
	        int result = count(s);
	        int result1 = count(s1);
	        System.out.println(s+" = "+result);
	        System.out.println(s1+" = "+result1);
	    }
}
