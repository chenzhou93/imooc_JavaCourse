package com.imooc.dom4j;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class hrReader {
	public void readXML() {
		String file = "/Users/chenzhou/Documents/Study/Computer Science Learning/imooc/imooc_JavaCourse/02_JavaWeb/03_JavaWeb/XML_Demo/src/hr.xml";
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			Element root = document.getRootElement();
			List<Element> employees = root.elements("employee");
			for(Element employee : employees) {
				//获取唯一字节点对象
				Element name = employee.element("name");
				String empName = name.getText();
				System.out.println(employee.elementText("age"));
				System.out.println(employee.elementText("salary"));
				Element department = employee.element("department");
				System.out.println(department.element("dname").getText());
				System.out.println(department.element("address").getText());
				
				Attribute att = employee.attribute("no");
				System.out.println(att.getText());
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		hrReader reader = new hrReader();
		reader.readXML();
	}
}
