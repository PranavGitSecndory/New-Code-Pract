package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class Fatch_data {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batchname","root","Jim@143143");
		
		PreparedStatement ps =con.prepareStatement("select * from nick");
		
		ResultSet rs = ps.executeQuery();
	
		System.out.println("id \t name   \t city");
		
		System.out.println("----------------------------");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ "   \t  "+rs.getString(2)+"   \t   "+rs.getString(3));
		}
		System.out.println("---------------------------");
		con.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
