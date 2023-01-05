package com.imooc.el;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student stu = new Student();
		stu.setName("Test");
		stu.setMobile(null);
		String grade = "A";
		
		request.setAttribute("student", stu);
		request.setAttribute("grade", grade);
		
		HttpSession session = request.getSession();
		session.setAttribute("grade", "B");
		request.getServletContext().setAttribute("grade", "C");
		
		//scope: page->request->session->application
		
		
		request.getRequestDispatcher("/info.jsp").forward(request, response);
	}

}
