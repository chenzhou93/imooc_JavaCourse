package com.imooc.servlet.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ImoocIndexServlet
 */
public class ImoocIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImoocIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cs = request.getCookies();
		String user = null;
		if(cs == null) {
			return;
		}
		for(Cookie c : cs) {
			System.out.println(c.getName() + ":" + c.getValue());
			if(c.getName().equals("user")) {
				user = c.getValue();
				break;
			}
		}
		
		if(user == null) {
			response.getWriter().println("user does not login");
		}else {
			response.getWriter().println("user: " + user);
		}
	}

}
