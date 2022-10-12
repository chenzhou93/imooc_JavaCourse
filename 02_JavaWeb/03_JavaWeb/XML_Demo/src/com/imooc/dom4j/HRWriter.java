package com.imooc.dom4j;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class HRWriter {
	public void writeXML() {
		String file = "/Users/chenzhou/Documents/Study/Computer Science Learning/imooc/imooc_JavaCourse/02_JavaWeb/03_JavaWeb/XML_Demo/src/hr.xml";
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			Element root = document.getRootElement();
			Element employee = root.addElement("employee");
			employee.addAttribute("no", "3311");
			Element name = employee.addElement("name");
			name.setText("Iron Li");
			
			employee.addElement("salary").setText("3500");
			Element department = employee.addElement("department");
			department.addElement("dname").setText("HR");
			department.addElement("address").setText("XX Building-b105");
			
			Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
			document.write(writer);
			writer.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		HRWriter hrWriter = new HRWriter();
		hrWriter.writeXML();
	}
}
