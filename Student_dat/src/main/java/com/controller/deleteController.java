package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

/**
 * Servlet implementation class deleteController
 */
@WebServlet("/deleteController")
public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int RollNo =Integer.parseInt(request.getParameter("RollNo"));
		int status =StudentDao.delete(RollNo);
		if(status > 0)
		{
			pw.print("<script>alert('data succesully delete')</script>");
			RequestDispatcher rd =request.getRequestDispatcher("ViewDataController");
			rd.include(request, response);
		}
		else
		{
			pw.print("<script>alert('somthing wrong...')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("ViewDataController");
			rd.forward(request, response);
		}
	
	}

}
