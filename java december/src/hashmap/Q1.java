//1. Find Duplicate Characters in a String
//   Problem Description:  
//   Write a Java program to find and print all duplicate characters 
//in a given string using a HashMap.
//
//   Input: A string.  
//   Output: A list of duplicate characters.
//
//   Example:
//   - Input: "programming"
//   - Output: g, r
package hashmap;

import java.util.HashMap;


public class Q1 {
	public static void main(String[] args) {
		
	
	String str ="programming";
HashMap<Character , Integer> map =new HashMap();
for (char ch : str.toCharArray())
{
    map.put(ch, map.getOrDefault(ch, 0) + 1);
}


System.out.print("Duplicate characters: ");
for (char ch : map.keySet()) 
{
    if (map.get(ch) > 1) 
    {
        System.out.print(ch + " ");
    }
}
	}
}
