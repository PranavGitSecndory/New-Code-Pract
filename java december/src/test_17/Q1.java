//4.  Take a sentence as a String input, and find 
//anagrams in the string.
//   for eg "peek up the call and keep the roses "
//           anagram strings : peek keep


package test_17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
public static void main(String[] args) {
	String s="peek keep the call and keep the roses";
	String a[]=s.split(" ");
	

	
	
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			char[] A= a[i].toCharArray();
			char []B= a[j].toCharArray();
			
			 Arrays.sort(A);
             Arrays.sort(B);
			
             if(Arrays.equals(A, B))
             {
            	 System.out.println(a[i]+" " +a[j]);
             }
		}
	}
	
	
}
}
