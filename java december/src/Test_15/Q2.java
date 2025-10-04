//Write a program to count and print the number of 
//occurrences of each character in a given string.
package Test_15;

public class Q2 {
	void count(String s)
	{
		 char[] arr = s.toCharArray();
	        boolean[] visited = new boolean[arr.length];
	       
	        for (int i = 0; i < arr.length; i++) {
	            if ( visited[i] ||arr[i] == ' ') {
	                continue; 
	            }
	        
		int count =1;
		  for (int j = i + 1; j < arr.length; j++)
		{
			 if (arr[i] == arr[j]) {
                 count++;
                 visited[j] = true;
             }
		}
			 System.out.println(arr[i] + " → " + count);
		}
	        
	}
public static void main(String[] args) {
	String s="helllo nick how are you";
	Q2 ob=new Q2();
	ob.count(s);
}
}
