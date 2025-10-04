package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete_data {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batchname","root","Jim@143143");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id");
		int id =sc.nextInt();
		
		PreparedStatement ps =con.prepareStatement("delete from nick where id = ?");
		
		ps.setInt(1, id);
		
		int status=ps.executeUpdate();
		
		if(status >0)
		{
			System.out.println("succesfully delete....");
		}
		else
		{
			System.out.println("Somthing went wrong ....");
		}
		
		con.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
