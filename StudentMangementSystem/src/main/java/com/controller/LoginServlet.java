package com.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if("admin".equals(username) && "admin123".equals(password)) {
            response.sendRedirect("dashboard.html");
        } else {
            out.println("<h3>Login failed! Invalid username or password.</h3>");
            out.println("<a href='login.html'>Try Again</a>");
        }
    }
}
