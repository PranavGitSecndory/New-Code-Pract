package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.LoginBo;
import com.doa.LoginDao;

/**
 * Servlet implementation class LoginCOntroller_sevlet
 */
@WebServlet("/LoginCOntroller_sevlet")
public class LoginCOntroller_sevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCOntroller_sevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter pw = response.getWriter();

	        String user = request.getParameter("user");
	        String pwd = request.getParameter("pwd");

	        LoginBo lb = new LoginBo(user, pwd);

	        int status = LoginDao.insertData(lb);
	        if (status > 0) {
	            pw.print("<script> alert('Login successfully .... ');</script>");
	            request.getRequestDispatcher("index.jsp").include(request, response);
	        } else {
	            pw.print("<script> alert('invalid username or password .... ');</script>");
	            request.getRequestDispatcher("login.jsp").include(request, response);
	        }
	}

}
