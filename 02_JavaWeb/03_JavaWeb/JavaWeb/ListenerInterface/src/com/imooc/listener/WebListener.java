package com.imooc.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class WebListener implements ServletContextListener,HttpSessionListener,ServletRequestListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		System.out.println(session.getId());
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
		System.out.println("HttpSevletRequest created: " + request.getRequestURI());
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		
	}

}
