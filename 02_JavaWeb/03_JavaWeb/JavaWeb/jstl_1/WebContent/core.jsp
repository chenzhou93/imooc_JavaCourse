<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> ${requestScope.score} </h1>
	<c:if test="${score >= 60}">
		<h1 style="color:green"> Pass </h1>
	</c:if>
	<c:if test="${score < 60}">
		<h1 style="color:red"> Fail </h1>
	</c:if>
	
	<c:choose>
		<c:when test="${grade=='A' }"> 
			<h2>A</h2>
		</c:when>
		<c:when test="${grade=='B' }"> 
			<h2>B</h2>
		</c:when>
		<c:when test="${grade=='C' }"> 
			<h2>C</h2>
		</c:when>
		<c:when test="${grade=='D' }"> 
			<h2>D</h2>
		</c:when>
		<c:otherwise>
			<h2>Other</h2>
		</c:otherwise>
	</c:choose>
	
	<c:forEach items="${requestScope.companies}" var = "c" varStatus = "idx">
		<h2 style="color:green"> ${idx.index + 1} -> ${c.cname } - ${c.url } </h2>
	</c:forEach>
	
</body>
</html>