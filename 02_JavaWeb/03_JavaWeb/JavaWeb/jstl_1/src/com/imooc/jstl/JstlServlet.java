package com.imooc.jstl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class JstlServlet
 */
public class JstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JstlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("score", 78);
		request.setAttribute("grade", "B");
		List<Company> companyList = new ArrayList<Company>();
		companyList.add(new Company("Tencent", "www.qq.com"));
		companyList.add(new Company("Baidu", "www.baidu.com"));
		companyList.add(new Company("Mooc", "www.imooc.com"));
		
		request.setAttribute("companies", companyList);
		
		request.getRequestDispatcher("/core.jsp").forward(request, response);
	}

}
