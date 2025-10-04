package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.LoginBo;
import com.doa.LoginDao;

/**
 * Servlet implementation class UseController
 */
@WebServlet("/UseController")
public class UseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UseController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	List<LoginBo> li = LoginDao.getAllUser();

	request.setAttribute("userList", li);
	RequestDispatcher rd= request.getRequestDispatcher("GetUserList.jsp");
	rd.forward(request, response);
	}

}
