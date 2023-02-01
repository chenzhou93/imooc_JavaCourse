package com.imooc.ajax;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import com.alibaba.fastjson.JSON;

/**
 * Servlet implementation class NewsListServlet
 */
public class NewsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<News> list = new ArrayList<News>();
		list.add(new News("TIOBE:2008-05", "2008-05-01", "TIOBE", "other"));
		list.add(new News("TIOBE:2008-06", "2008-05-01", "TIOBE", "other"));
		list.add(new News("TIOBE:2008-07", "2008-05-01", "TIOBE", "other"));
		String json = JSON.toJSONString(list);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println(json);
	}

}
