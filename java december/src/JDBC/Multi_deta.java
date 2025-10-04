package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Multi_deta {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/batchname","root","Jim@143143");
		
		PreparedStatement ps= con.prepareStatement("insert into nick values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter id,name,city ");
			int id=sc.nextInt();
			String name=sc.next();
			String city=sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, city);
			
			ps.addBatch();
			System.out.println("do you want to continye insert Y else N ");
			char ch =sc.next().charAt(0);
			if(ch == 'n' || ch == 'N')
				break;
		}	
		int status[]=ps.executeBatch();
		if(status.length > 0)	
			{
				System.out.println("Data insert succesfully..");
			}
		else
		{
			System.out.println("somthing went wrong...");
		}
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
