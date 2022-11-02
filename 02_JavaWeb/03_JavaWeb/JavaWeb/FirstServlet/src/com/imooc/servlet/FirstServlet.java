package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public FirstServlet() {
		System.out.println("creating servlet instance");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("initializing servlet instance");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroying servlet instance");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String html = "<h1 style='color:red'> Hello, " + name + "</h1> <hr/> ";
		PrintWriter out = response.getWriter();
		out.println(html);//将html发送回浏览器
	}
	
}	
