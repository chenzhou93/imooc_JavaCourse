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
 * Servlet implementation class ChannelServlet
 */
public class ChannelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChannelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String level = request.getParameter("level");
		String parent = request.getParameter("parent");
		ArrayList<Channel> chlist = new ArrayList<Channel>();
		if(level.equals("1")) {
			chlist.add(new Channel("ai", "blockchain/ai"));
			chlist.add(new Channel("web", "frontend/js"));
		}else if(level.equals("2")) {
			if(parent.equals("ai")) {
				chlist.add(new Channel("micro", "micro"));
			}else if(parent.equals("web")) {
				chlist.add(new Channel("html", "HTML"));
			}
		}
		
		String json = JSON.toJSONString(chlist);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(json);
	}

	

}
