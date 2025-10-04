package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchname","root","Jim@143143");
		
		String sql ="insert into nick values(?,?,?)";
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setInt(1, 3);
		ps.setString(2, "Don");
		ps.setString(3, "Bihar");
		
		ps.setInt(1, 4);
		ps.setString(2, "Mayur");
		ps.setString(3, "lumkheda");
		
		int status =ps.executeUpdate();
		if(status >0)
		{
			System.out.println("Data insiert scucessfully");
		}
		else
		{
			System.out.println("Somthing is wrong");
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
