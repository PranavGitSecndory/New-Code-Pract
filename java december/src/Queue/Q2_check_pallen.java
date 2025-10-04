// 2. Palindrome Check
//   Write a program to check if a given string is a
//   palindrome using ArrayDeque. Use the deque to
//   compare characters from the front and back.
package Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Q2_check_pallen {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String input = sc.nextLine();
     
     ArrayDeque ob =new  ArrayDeque();
     for(char ch : input.toCharArray())
{
	ob.add(ch);
}
     boolean isPalindrome =true;
     
     while(!ob.pollFirst().equals(ob.pollLast()))
     {
    	 isPalindrome =false;
    	 break;
     }
    		 
    		 
     
     if (isPalindrome) {
         System.out.println("The string is a palindrome.");
     } else {
         System.out.println("The string is not a palindrome.");
     }
}
}
