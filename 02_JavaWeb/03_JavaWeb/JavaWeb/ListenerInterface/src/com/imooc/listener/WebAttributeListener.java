package com.imooc.listener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

public class WebAttributeListener implements ServletContextAttributeListener,HttpSessionAttributeListener,ServletRequestAttributeListener {
	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println(event.getName() + " " + event.getValue());
	}
	
	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		
	}
	
	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println(event.getName() + " " + event.getValue());
	}
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		
	}
	
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		
	}
	
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		
	}
	
	@Override
	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println(event.getName() + " " + event.getValue());
	}
	
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent event) {
		
	}
	
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent event) {
		
	}

}
