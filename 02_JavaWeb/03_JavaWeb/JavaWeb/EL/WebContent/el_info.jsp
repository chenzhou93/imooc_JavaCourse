<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Name: ${requestScope.student.name}</h1>
	<h2>Mobile: ${requestScope.student.mobile}</h2>
	<h2>Grade: ${requestScope.grade}</h2>
	<h2>Grade: ${grade}</h2> 
	<!-- pageScope, requestScope, sessionScope, applicationScope  -->
	
	<h2>Overall: ${student}</h2> <!--  toString() -->
	<h2>Lecturer: ${param.teacher }</h2> <!--  get this param from browser -->
</body>
</html>