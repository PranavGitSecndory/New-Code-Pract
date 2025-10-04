//1. Wap create a file and add any sentence in it,
//   now from that file , find out :
//   
//       1)no of words started with vowel
//       2)frequency of charcater
//       3)most repeated words
package File_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
	
	try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the file name we want to create ");
		String s=sc.nextLine();
		
		
		FileWriter ob=new FileWriter("C:\\Users\\patil\\OneDrive\\Desktop\\File_handle\\"+s);
		
		System.out.println("Enter some text");
		String str =sc.nextLine();
		ob.write(str);
		
		ob.close();
		System.out.println("write content sucessfully ..");
		
		 FileReader fr = new FileReader("C:\\Users\\patil\\OneDrive\\Desktop\\File_handle\\" + s);
         BufferedReader br = new BufferedReader(fr);
         String line = br.readLine();
         System.out.println(line);
         br.close();
         
         
         String[] words = line.split(" ");
         int vowelCount = 0;

         for (String word : words)
         {
             if (word.length() > 0) {
                 char first = Character.toLowerCase(word.charAt(0));
                 if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
                     vowelCount++;
                 }
             }
         }
         
         int[] charFreq = new int[256]; // For all ASCII characters

         for (int i = 0; i < line.length(); i++) {
             char ch = line.charAt(i);
             if (ch != ' ') {
                 charFreq[ch]++;
             }
         }

         
         
         int max = 0;
         String mostRepeated = "";
         for (String w1 : words) {
             int count = 0;
             for (String w2 : words) {
                 if (w1.equalsIgnoreCase(w2)) {
                     count++;
                 }
             }
             if (count > max) {
                 max = count;
                 mostRepeated = w1;
             }
         }
         
         System.out.println("\nWords starting with vowels: " + vowelCount);

         System.out.println("\nCharacter frequencies:");
         for (int i = 0; i < 256; i++) {
             if (charFreq[i] > 0) {
                 System.out.println((char) i + " = " + charFreq[i]);
             }
         }

         System.out.println("\nMost repeated word: " + mostRepeated + " (repeated " + max + " times)");

         
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
