<%@page import="com.bo.LoginBo"%>
<%@page import="com.doa.LoginDao"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login controller</title>
</head>
<body>

<%

	String user =request.getParameter("user");
	String pwd =request.getParameter("pwd");
	
	session.setAttribute("session_user", user);

    LoginBo lb = new LoginBo(user, pwd);
    int status = LoginDao.insertData(lb);

    if (status > 0)
    {
	
    	out.print( "<script>alert('Login successfully ....');</script>");
       request.getRequestDispatcher("index.jsp").include(request, response);    
    } 
    else
    {
    	out.print( "<script>alert('Login successfully ....');</script>");
        request.getRequestDispatcher("login.jsp").include(request, response);  
          
          
    }  
%>    
    
	
</body>
</html>