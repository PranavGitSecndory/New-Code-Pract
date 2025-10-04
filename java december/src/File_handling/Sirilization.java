package File_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {
    int id;
    String name;
    String address;

    public Emp(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
public class Sirilization {
public static void main(String[] args) {
	 Emp a1 =new Emp(101,"kalyani","pune");
	 Emp a2 =new Emp(102,"samiksha","nashik");
	 
	 File ob=new File("C:\\Users\\patil\\OneDrive\\Desktop\\File_handle\\divesh.ser");
	 
	 try {
		FileOutputStream fos =new FileOutputStream(ob);
		
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		
		oos.writeObject(a1);	
		oos.writeObject(a2);	
		
		oos.close();
		fos.close();

        System.out.println("Objects serialized successfully.");
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
