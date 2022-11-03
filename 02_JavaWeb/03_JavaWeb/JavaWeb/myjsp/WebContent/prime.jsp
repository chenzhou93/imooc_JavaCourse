<%@page import="java.util.*, java.text.*" contentType="text/html;charset=utf-8" %>

<%! 
	boolean isPrime(int num){
		boolean flag = true;
		for(int j=2; j<num; j++){
			if(num%j == 0){
				flag = false;
				break;
			}
		}
		return flag;
	}
%>
<% 
	List<Integer> primes = new ArrayList<Integer>();
	for(int i=2; i<1000; i++){
		if(isPrime(i)){
			//out.println("<h1>" + i + "</h1>");
			primes.add(i);
		}
	}
%>

<%
	for(int p: primes){
		//out.println("<h1>" + p + "</h1>");
%>
	<h1> <%= p%> is a prime number </h1>
<%
	}
%>