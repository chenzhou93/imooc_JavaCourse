package com.imooc.ajax;

public class News {
	private String title;
	private String date;
	private String source;
	private String content;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public News(String title, String date, String source, String content) {
		super();
		this.title = title;
		this.date = date;
		this.source = source;
		this.content = content;
	}
	
	public News() {
		
	}
	
	
}
