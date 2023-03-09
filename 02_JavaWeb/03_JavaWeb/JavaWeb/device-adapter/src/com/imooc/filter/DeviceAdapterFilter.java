package com.imooc.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeviceAdapterFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String uri = req.getRequestURI();
		if(uri.startsWith("/desktop") || uri.startsWith("/mobile")) {
			chain.doFilter(req, res);
		}else {
			String userAgent = req.getHeader("user-agent").toLowerCase();
			String targetURI = "";
			if(userAgent.indexOf("android") != -1 || userAgent.indexOf("iphone") != -1) {
				targetURI = "/mobile" + uri;
				res.sendRedirect(targetURI);
			}else {
				//PC
				targetURI = "/desktop" + uri;
			}
		}
		
	}

}
