package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.Student;
import com.dao.StudentDao;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudentServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		String className = request.getParameter("student_class");
		String address = request.getParameter("address");

		// Input validation
		if (name == null || name.trim().isEmpty() ||
		    ageStr == null || ageStr.trim().isEmpty() ||
		    className == null || className.trim().isEmpty() ||
		    address == null || address.trim().isEmpty()) {

			response.getWriter().println("<h3 style='color:red;'>Please fill all the details!</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("add_student.html");
			rd.include(request, response);
			return;
		}

		try {
			int age = Integer.parseInt(ageStr);

			Student student = new Student();
			student.setName(name);
			student.setAge(age);
			student.setClassName(className);
			student.setAddress(address);

			int status = StudentDao.insertStudent(student);

			if (status > 0) {
				response.getWriter().println("<h3 style='color:green;'>Student Added Successfully!</h3>");
			} else {
				response.getWriter().println("<h3 style='color:red;'>Error Adding Student</h3>");
			}

		} catch (NumberFormatException e) {
			response.getWriter().println("<h3 style='color:red;'>Age must be a number!</h3>");
		}

		response.getWriter().println("<br><a href='dashboard.html'>Back to Dashboard</a>");
		RequestDispatcher rd = request.getRequestDispatcher("add_student.html");
		rd.include(request, response);
	}
}
