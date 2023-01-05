<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String url = request.getRequestURL().toString(); //HttpServletRequest
		response.getWriter().println(url);//HttpServletResponse
	%>
	
	<%
		out.println("<br>ABCCC");
		session.setAttribute("user", "zhangsan");
		out.println((String)session.getAttribute("user"));
	%>
	<%
		String cp = application.getInitParameter("copyright");//ServletContext
		out.println("<hr/> cp");
		pageContext.getRequest();
		pageContext.getResponse();
		pageContext.getSession();
		pageContext.getServletContext();
	%>
</body>
</html>