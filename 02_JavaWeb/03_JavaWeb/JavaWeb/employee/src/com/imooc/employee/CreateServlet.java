package com.imooc.employee;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;
import java.io.IOException;

/**
 * Servlet implementation class CreateServlet
 */
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String department = request.getParameter("department");
		String job = request.getParameter("job");
		String salary = request.getParameter("salary");
		
		Employee emp = new Employee(Integer.parseInt(empno), ename, department, job, Float.parseFloat(salary));
		ServletContext context = request.getServletContext();
		List<Employee> employees = (List<Employee>)context.getAttribute("employees");
		employees.add(emp);
		context.setAttribute("employees", employees);
		request.getRequestDispatcher("/employee.jsp").forward(request, response);
		
	}

}
