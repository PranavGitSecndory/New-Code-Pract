package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.student;
import com.dao.StudentDao;

/**
 * Servlet implementation class ViewDataController
 */
@WebServlet("/ViewDataController")
public class ViewDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDataController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.print("<h1> student infromation</h1>");
		List<student> li = StudentDao.viewData();
		
		pw.print("<table border=2>");
		pw.print("<tr><th>RollNo</th><th>Name</th><th>Password</th><th>ContactNo</th><th>Email_id</th><th>Birht_date</th><th>city</th><th>Edit</th><th>Delete</th></tr>");
		
		for(student s :li)
		{
			pw.print("<tr><th>"+s.getRollNo()+"</th><th>"+s.getName()+"</th><th>"+s.getPassword()+"</th><th>"+s.getContactno()+"</th><th>"+s.getEmail()+"</th><th>"+s.getBirhtdate()+"</th><th>"+s.getCity()+"</th><th><a href =Editcontroller?RollNo="+s.getRollNo()+">Edit</a></th><th><a href =deleteController?RollNo="+s.getRollNo()+">Delete</a></th></tr>");
		}
		
		pw.print("</table>");
	}

}