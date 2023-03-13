package com.imooc.total;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.http.HttpServletRequest;

public class RequestTotalListener implements ServletContextListener, ServletRequestListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		List timeList = new ArrayList();
		List valueList = new ArrayList();
		
		sce.getServletContext().setAttribute("timeList", timeList);
		sce.getServletContext().setAttribute("valueList", valueList);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		
		HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
		String url = request.getRequestURL().toString();
		if(url.endsWith("/rt") == true) {
			return;
		}
		
		//Time List: 10:02 10:03 10:04
		//Value List:  3     4     1
		List<String> timeList = (List)sre.getServletContext().getAttribute("timeList");
		List<Integer> valueList = (List)sre.getServletContext().getAttribute("valueList");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String time = sdf.format(date);
		
		if(timeList.indexOf(time) == -1) {
			timeList.add(time);
			valueList.add(1);
			sre.getServletContext().setAttribute("timeList", timeList);
			sre.getServletContext().setAttribute("valueList", valueList);
		}else {
			int index = timeList.indexOf(time);
			int value = valueList.get(index);
			valueList.set(index, value+1);
			sre.getServletContext().setAttribute("valueList", valueList);
		}
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		
	}
}
