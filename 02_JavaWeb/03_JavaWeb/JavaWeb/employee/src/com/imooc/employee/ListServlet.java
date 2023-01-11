package com.imooc.employee;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = request.getServletContext();
		
		if(context.getAttribute("employees") == null) {
			List<Employee> list = new ArrayList<>();
			Employee emp  = new Employee(7731, "name1", "market", "customer", 100000f);
			list.add(emp);
			list.add(new Employee(7731, "name2", "engineering", "dev ops", 100000f));
			
			context.setAttribute("employees", list);
		}
		
		request.getRequestDispatcher("/employee.jsp").forward(request, response);

	}

}
