package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.student;
import com.dao.StudentDao;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("pwd");
		String contactno=request.getParameter("contactno");
		String email=request.getParameter("email");
		String birthdate = request.getParameter("birthdate");
		String city=request.getParameter("city");
		int RollNo=Integer.parseInt(request.getParameter("RollNo"));
		
		student s=new student(RollNo,name,password,contactno,email,birthdate,city);
		int status=StudentDao.UpdateStudent(s);
		if(status >0)
		{
			pw.print("<script>alert('data successfully update...')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("DashBorad.html");
			rd.include(request, response);
		}
		else
		{
			pw.print("<script>alert('somthing is wrong...')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("DashBorad.html");
			rd.include(request, response);
		}
				
	}			
}
