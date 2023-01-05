package com.imooc.servlet.pattern;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PatternServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getRequestURL().toString();
		System.out.println(url);
		String id = url.substring(url.lastIndexOf("/") + 1);
		int eid = Integer.parseInt(id);
		PrintWriter out = response.getWriter();
		out.println(id);
		if(id.equals("1")) {
			out.println("zhangsan");
		}else if(id.equals("2")){
			out.println("lisi");
		}
	}
	
}
