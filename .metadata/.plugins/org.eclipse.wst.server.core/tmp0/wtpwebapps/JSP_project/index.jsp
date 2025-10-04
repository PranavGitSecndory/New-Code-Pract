

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page errorPage="Error.jsp" %>
     <%@include file="Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index page</title>
</head>
<body>
<h1>This Is JSP Project...</h1>
 <h2>Welcome 
        <%
          
            String user = (String) session.getAttribute("session_user");
            if (user != null) {
                out.print(user);
            } else {
                out.print("Guest");
            }
        %>
    </h2>

<a href="login.jsp">go to the login page</a><br>

<a href="AllUser.jsp">View user list </a>





<!--  <form action="pallen.jsp" method="post">
<input type = "text" name="number"> <br>
<input type="submit" value="check palindrome"> 
</form> -->
</body>
</html>