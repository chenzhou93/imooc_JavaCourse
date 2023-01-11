<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<thead>
	</thead>
	<tbody>
		<c:forEach items="${applicationScope.employees}" var="emp" varStatus="idx"> 
			<tr>
				<td>${idx.index + 1}</td>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.department}</td>
				<td>${emp.job}</td>
				<td><fmt:formatNumber value="${emp.salary}" pattern="0,000.00"></fmt:formatNumber></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>