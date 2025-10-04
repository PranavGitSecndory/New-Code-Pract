package File_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Write_data {
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
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
