<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	
		request.setAttribute("html", "<a href='index.html'> index </a>");
		request.setAttribute("nothing", null);
		request.setAttribute("amt", 1987654.326);
		request.setAttribute("now", new java.util.Date());
	%>
	
	<!-- format pattern
		yyyy - year
		MM - month
		dd - day
		HH - 24 hour
		hh - 12 hour
		mm - min
		ss - second
		SSS - millisecond
	 -->
	 <h2>
	 	${now}
	 </h2>
	 
	<h2>
		<fmt:formatDate value="${requestScope.now}" pattern="yyyy/MM/dd HH:mm:ss sss" />
	</h2>
	<h2>
		<fmt:formatNumber value="${requestScope.amt}" pattern="0.00" />
	</h2>
	<h2>
		$<fmt:formatNumber value="${requestScope.amt}" pattern="0,000.00" />
	</h2>
	<h2>
		Nothing default: <c:out value="${nothing}" default="none"></c:out>
	</h2>
	
	<h2>
		<c:out value="${html}" excapeXml="true"></c:out> 
	</h2>
	
</body>
</html>