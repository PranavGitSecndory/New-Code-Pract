package File_handling;

import java.io.File;

public class Delete_File {
public static void main(String[] args) {
	try {
		File ob =new File("C:\\Users\\patil\\OneDrive\\Desktop\\File_handle\\ketan\\");
		boolean b=ob.delete();
		if(b==true)
		{
			System.out.println("you deleat file");
		}
		else
		{
			System.out.println("Eroor!!!!!");
		}
		
	} catch (Exception e) {
	System.out.println(e);
	}
}
}
