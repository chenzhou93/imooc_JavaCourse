package com.imooc.servlet;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RequestMethodServlet extends HttpServlet {
	//Handle GET
	public void doGet(HttpServletRequest request,  HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		response.getWriter().println("<h1 style='color:green'>"+ name + "</h1>");
	}
	
	public void doPost(HttpServletRequest request,  HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		response.getWriter().println("<h1 style='color:green'>"+ name + "</h1>");
	}
}
