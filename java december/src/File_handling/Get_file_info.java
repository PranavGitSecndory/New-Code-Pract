package File_handling;

import java.io.File;

public class Get_file_info {
public static void main(String[] args) {
	try {
		File ob =new File("C:\\Users\\patil\\OneDrive\\Desktop\\File_handle\\sagar\\");
		
		if(ob.exists())
		{
			System.out.println("name of file : "+ob.getName() );
			System.out.println("path of file : "+ob.getAbsolutePath() );
			System.out.println("file in read moade : "+ob.canRead() );
			System.out.println("file in write mode : "+ob.canWrite() );
			System.out.println("file size in byte : "+ob.length() );
		}
		else
		{
			System.out.println("file not found");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
