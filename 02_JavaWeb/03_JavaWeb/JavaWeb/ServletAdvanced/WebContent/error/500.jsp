<%@ page contentType="text/html;charset=utf-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Internal server error</title>
</head>
<body>
	Internal server error
	<%
		String msg = exception.getMessage();
		out.println(exception.getClass().getSimpleName + msg);
	%>
</body>
</html>