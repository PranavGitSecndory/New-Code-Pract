//2. Count Frequency of Words in a Sentence
//   Problem Description:  
//   Write a Java program to count the frequency of each 
//   word in a sentence using a HashMap.
//
//   Input: A sentence string.  
//   Output: A map showing the frequency of each word.
//
//   Example:
//   - Input: "Java is great and Java is powerful"
//   - Output: {"Java": 2, "is": 2, "great": 1, "and": 1, "powerful": 1}
package hashmap;

import java.util.HashMap;

public class Q2 {
public static void main(String[] args) {
	String s="Java is great and Java is powerful";
	HashMap<String , Integer> ob =new HashMap<String, Integer>();
	
	String k []=s.split(" ");
	for(String word : k)
	{
		if(ob.containsKey(word))
		{
			ob.put(word, ob.get(word)+1);
		}
		else
		{
			ob.put(word, 1);
		}
	}
	System.out.println("Word frequence : "+ob);
	
}
}
