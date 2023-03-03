package com.imooc.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFirstFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter is working");
		chain.doFilter(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("filter destroyed");
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		System.out.println("success filter init");
	}
	
	
	
}
