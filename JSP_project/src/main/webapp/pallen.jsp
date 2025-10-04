<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome 
        <%
            // Retrieve session attribute safely
            String user = (String) session.getAttribute("session_user");
            if (user != null) {
                out.print(user);
            } else {
                out.print("Guest");
            }
        %>
    </h2>
<%
int num = Integer.parseInt(request.getParameter("number"));

int rev = 0;
int temp = num;

while (num != 0)
{
	rev = (rev * 10 ) + (num % 10);
	num = num / 10;
}

if ( temp == rev)
{
	out.print(rev+"<br>"+ "Given number is pallindrome...");
}
else
{
	out.print(temp+"<br>"+"Given number is not pallindrome...");
}
%>
</body>
</html>