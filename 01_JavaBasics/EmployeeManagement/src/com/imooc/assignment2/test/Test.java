package com.imooc.assignment2.test;
import com.imooc.company.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Position manager = new Position("P001", "经理");
		Position assistant = new Position("P002", "助理");
		Position stuff = new Position("P003", "职员");
		
		Department humanResource = new Department("D001", "人事部");
		Department market = new Department("D002", "市场部");
		
		Employee[] employeeList = new Employee[6];
		Employee zhangming = new Employee("张铭","S001","男",29, humanResource, manager);
		humanResource.addEmployee(zhangming);

		
		Employee liaiai = new Employee("李艾爱","S002","女",21, humanResource, assistant);
		humanResource.addEmployee(liaiai);
		
		Employee sunchao = new Employee("孙超","S003","男",29, humanResource, stuff);
		humanResource.addEmployee(sunchao);
		
		Employee zhangmeimei = new Employee("张美美","S004","女",26, market, stuff);
		market.addEmployee(zhangmeimei);
		
		Employee landi = new Employee("蓝迪","S005","男",37, market, manager);
		market.addEmployee(landi);
		
		Employee mili = new Employee("米莉","S006","女",24, market, stuff);
		market.addEmployee(mili);
		
		for(int i=0; i<humanResource.getNum(); i++) {
			System.out.println(humanResource.getEmployeeList()[i].selfIntro());
		}
		
		for(int i=0; i<market.getNum(); i++) {
			System.out.println(market.getEmployeeList()[i].selfIntro());
		}

		System.out.println(humanResource.printDptInfo());
		System.out.println(market.printDptInfo());

	}

}
