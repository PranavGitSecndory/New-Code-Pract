package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.protocol.Resultset;

public class Search_data {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("Jdbc:mysql://localhost:3306/batchname","root","Jim@143143");
		
		PreparedStatement ps=con.prepareStatement("SELECT * FROM nick WHERE id = ?");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter seatrch id ");
		int id=sc.nextInt();
		
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
	{
			 System.out.println("ID: " + rs.getInt("id"));
             System.out.println("Name: " + rs.getString("name"));
             System.out.println("city: " + rs.getString("city"));
	}
		rs.close();
        ps.close();
        con.close();
		
	} catch (Exception e) {
	System.out.println(e);
	}
}
}
