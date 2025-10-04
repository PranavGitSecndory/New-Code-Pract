<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'welcome to jstl'} "></c:out><br><br>

<c:forEach var= "i" begin = "1" end="10">
<h3>${i}</h3>
</c:forEach>









<!-- 
<c:set var="days" scope="session" value="4"></c:set>
<c:out value="${'Day is a : '}"></c:out>
<c:choose>
<c:when test="${days == 1}">
<h4>Monday</h4>
</c:when>
<c:when test="${days == 2}">
<h4>Tuesday</h4>
</c:when>
<c:when test="${days == 3}">
<h4>Wednesday</h4>
</c:when>
<c:when test="${days == 4}">
<h4>Thursday</h4>
</c:when>
<c:when test="${days == 5}">
<h4>Friday</h4>
</c:when>
<c:when test="${days == 6}">
<h4>Saturday</h4>
</c:when>
<c:when test="${days == 7}">
<h4>Sunday</h4>
</c:when>
<c:otherwise>
<h4>There are only 7 days a week</h4>
</c:otherwise>
</c:choose>





	<c:set var="age" scope="session" value="${22}"></c:set>
	<c:if test="${age >= 18}">
	<h1>User is eligible for vote...</h1>
	<p>Your age is ${age} </p>
	</c:if>



<c:catch var="Exc">
	<% 
	//int a []={1,2,3};
	//out.print(a[a.length]);
	%>
	</c:catch>
	<c:if test="${Exc != null }">
	<p>Type of Exeption : ${Exc} </p>
	</c:if>
	
	
	
	<c:import url="Header.jsp" var="Data"></c:import>
	<c:out value="${Data}"></c:out>
	
	<c:set var="add" scope="session" value="${100+200 }"></c:set><br><br>
	Addition : <c:out value="${add}"></c:out>
	
	<c:remove var="Data"/><br><br>
	after remove Header data : <c:out value="${Data}"></c:out>
	 -->
	
</body>
</html>