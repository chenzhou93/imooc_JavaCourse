package com.imooc.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class XPathTest {
	public void xpath(String xpathExp) {
		String file = "/Users/chenzhou/Documents/Study/Computer Science Learning/imooc/imooc_JavaCourse/02_JavaWeb/03_JavaWeb/XML_Demo/src/hr.xml";
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			List<Node> nodes = document.selectNodes(xpathExp);
			for(Node node: nodes) {
				Element emp = (Element)node;
				System.out.println(emp.attributeValue("no"));
				System.out.println(emp.elementText("name"));
				System.out.println(emp.elementText("age"));
				System.out.println(emp.elementText("salary"));
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		XPathTest test = new XPathTest();
		test.xpath("/hr/employee");
		test.xpath("//employee");
		test.xpath("//employee[salary<4000]");
		test.xpath("//employee[name='Zhang San']");
		test.xpath("//employee[@no=3301]");
		test.xpath("//employee[1]");
		test.xpath("//employee[last()]");
		test.xpath("//employee[position()<6]");
		test.xpath("//employee[3] | //employee[8]");
	}
}
