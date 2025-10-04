<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="Error.jsp" %>
    <%@include file="Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>



<form action="LoginControllerJSp.jsp"  method="post">

<input type="text" name="user"  placeholder="Enter username"><br>
<input type="password" name="pwd" placeholder="Enter password"><br>
<input type="submit">

</form>
</body>
</html>