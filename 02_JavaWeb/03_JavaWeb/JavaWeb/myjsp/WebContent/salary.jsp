<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>year</th>
			<th>salary</th>
		</tr>
		<% 
			for(int i=0; i<=50; i++){
				out.println("<tr>");
				out.println("<td>" + i + "</td>");
				int salary = 0;
				if(i <= 5){
					salary = 1500 + i * 150;
				}else if(i > 5 && i <= 10){
					salary = 1500 + 150 * 5 + 300 * (i-5);
				}else if(i > 10){
					salary = 1500 + 150 * 5 + 300 * 5 + 375 *(i-10);
				}
				out.println("<td>" + salary + "</td>");
				out.println("</tr>");
			}
		%>
		<!-- <tr>
			<td>0</td>
			<th>1500</th>
		</tr>
		<tr>
			<td>1</td>
			<th>1650</th>
		</tr>
		<tr>
			<td>2</td>
			<th>1800</th>
		</tr> -->
	</table>

</body>
</html>