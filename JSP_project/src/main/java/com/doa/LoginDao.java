package com.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bo.LoginBo;




public class LoginDao {


	public static Connection getConnection()
	{
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchname","root","Jim@143143");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
	public static int insertData( LoginBo s)
	{
		int status = 0;
		
		try {
			Connection con = LoginDao.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into login values (0,?,?)");
			
		
			ps.setString(1, s.getUsername());
			ps.setString(2, s.getPassword() );
		
			
			status = ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
	
	public static List<LoginBo> getAllUser()
	{
		List<LoginBo> li = new ArrayList<LoginBo>();
		
		try
		{
			Connection con = LoginDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from login");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				LoginBo lb = new LoginBo();
				lb.setId(rs.getInt(1));
				lb.setUsername(rs.getString(2));
				lb.setPassword(rs.getString(3));
				li.add(lb);	
			}
		} 
		catch (Exception e)
		{
			
		}
		return li;
	}
	
}
