package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update_data {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batchname","root","Jim@143143");
		Scanner sc=new Scanner(System.in);
		
		PreparedStatement ps= con.prepareStatement( "UPDATE nick SET name = ?, city = ? WHERE id = ?");
		
		System.out.println("enter id to update");
		int id= sc.nextInt();
		
		System.out.println("enter name");
		String name= sc.next();
		
		System.out.println("enter city");
		String city= sc.next();
		
		
		
		ps.setString(1, name);
		ps.setString(2, city);
		ps.setInt(3, id);
		
		int status =ps.executeUpdate();
		
		if(status >0)
		{
			System.out.println("succsesfully update ");
		}
		else
		{
			System.out.println("something went wrong");
		}
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
