package com.imooc.json;

import java.util.Calendar;

import com.alibaba.fastjson.JSON;

public class FastJSONSample1 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpno(4488);
		employee.setEname("xiaodong");
		employee.setJob("manager");
		employee.setSalary(10000f);
		employee.setDname("market");
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 30, 0, 0, 0);
		employee.setHdate(c.getTime());
		
		//FastJSON
		String json = JSON.toJSONString(employee);
		System.out.println(json);
		
		Employee emp = JSON.parseObject(json, Employee.class);
	}
}
