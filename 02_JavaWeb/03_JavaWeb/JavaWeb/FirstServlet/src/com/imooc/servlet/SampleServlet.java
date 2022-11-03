package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		String[] specs = request.getParameterValues("spec");
		PrintWriter out = response.getWriter(); //向浏览器输出的数据流
		out.println("<h1> name: " + name +" </h1>");
		out.println("<a href='http://www.google.com>' Google </a>");
		for(int i=0; i<specs.length; i++) {
			out.println("<h2>" + specs[i] + "</h2>");
		}
	}
}
