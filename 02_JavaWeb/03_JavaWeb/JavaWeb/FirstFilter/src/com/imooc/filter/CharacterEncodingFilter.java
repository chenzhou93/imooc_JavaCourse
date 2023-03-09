package com.imooc.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebFilter(filterName="CharacterEncodingFilter",urlPatterns="/*",
	initParams= {
			@WebInitParam(name="encoding",value="UTF-8"),
			@WebInitParam(name="p1",value="v1")
	})
public class CharacterEncodingFilter implements Filter {
	
	private String encoding;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		encoding = filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		//req.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding(encoding);
		HttpServletResponse res = (HttpServletResponse) response;
		//res.setContentType("text/html;charset=UTF-8");
		res.setContentType("text/html;charset="+encoding);
		
		chain.doFilter(req, res);
	}
	
}
