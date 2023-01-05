<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.imooc.el.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Student stu = (Student)request.getAttribute("student");
		String grade = (String)request.getAttribute("grade");
		out.println("<h1> name: " + stu.getName() + "</h1>");
	%>
</body>
</html>