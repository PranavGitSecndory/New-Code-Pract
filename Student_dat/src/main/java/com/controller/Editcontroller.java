package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.student;
import com.dao.StudentDao;

/**
 * Servlet implementation class Editcontroller
 */
@WebServlet("/Editcontroller")
public class Editcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editcontroller() {
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
		
		   int RollNo = Integer.parseInt(request.getParameter("RollNo"));

		    student s = StudentDao.getStudentById(RollNo);

		    pw.print("<form action='UpdateController' method='post'>");
		    pw.print("<table>");
		    pw.print("<tr><td></td><td><input type='hidden' name='RollNo' value='" + s.getRollNo() + "'></td></tr>");
		    pw.print("<tr><th>Name :</th><td><input type='text' name='name' value='" + s.getName() + "'></td></tr>");
		    pw.print("<tr><th>Password :</th><td><input type='text' name='pwd' value='" + s.getPassword() + "'></td></tr>");
		    pw.print("<tr><th>Contact-No :</th><td><input type='text' name='contactno' value='" + s.getContactno() + "'></td></tr>");
		    pw.print("<tr><th>Email-Id :</th><td><input type='text' name='email' value='" + s.getEmail() + "'></td></tr>");
		    pw.print("<tr><th>Birthdate :</th><td><input type='text' name='birthdate' value='" + s.getBirhtdate() + "'></td></tr>");
		    pw.print("<tr><th>City :</th><td><input type='text' name='city' value='" + s.getCity() + "'></td></tr>");
		    pw.print("<tr><td colspan='2'><input type='submit' value='Update'></td></tr>");
		    pw.print("</table>");
		    pw.print("</form>");
	}

}
