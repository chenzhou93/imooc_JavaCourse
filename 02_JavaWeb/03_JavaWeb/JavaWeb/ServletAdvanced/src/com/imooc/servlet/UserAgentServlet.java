package com.imooc.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UserAgentServlet
 */
public class UserAgentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAgentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userAgent = request.getHeader("User-Agent");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(userAgent);
		String output = "";
		if(userAgent.indexOf("Windows NT") != -1) {
			output = "<h1> This is PC </h1>";
		}else if(userAgent.indexOf("iPhone") != -1 || userAgent.indexOf("Android") != -1) {
			output = "<h1> This is Mobile </h1>";
		}
		response.getWriter().println(output);
	}

}
