package com.imooc.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/unused", loadOnStartup=2)
public class CreateServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("creating database");
	}
	
}
