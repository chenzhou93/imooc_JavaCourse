package com.imooc.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class FastJSONSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<>();
		for(int i=1; i<=100; i++) {
			Employee emp = new Employee();
			emp.setEmpno(4488 + i);
			emp.setEname("Member " + i);
			empList.add(emp);
		}
		
		String json = JSON.toJSONString(empList);
		System.out.println(json);
		
		List<Employee> employees = JSON.parseArray(json, Employee.class);

	}

}
