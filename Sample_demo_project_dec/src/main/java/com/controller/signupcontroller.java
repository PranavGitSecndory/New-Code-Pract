package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class signupcontroller
 */
@WebServlet("/signupcontroller")
public class signupcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		pw.print(user+"<br> ");
		pw.print(pwd);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Drive"
					+ "r");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batchname","root","Jim@143143");
			
			PreparedStatement ps=con.prepareStatement("insert into signup values(?,?)");
			ps.setString(1, user);
			ps.setString(2, pwd);
			
			int status=ps.executeUpdate();
			if(status>0)
			{
				pw.print("\n    data add sucsessfully");
			}
			else
			{
				pw.print("sonething went wrong");
			}
					
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
