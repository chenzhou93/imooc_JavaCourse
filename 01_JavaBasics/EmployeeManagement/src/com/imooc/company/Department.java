package com.imooc.company;

public class Department {
	private String id;
	private String name;
	private Employee[] employeeList;
	private int num;
	
	public Department() {
		
	}
	
	public Department(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Department(String id, String name, Employee[] employeeList, int num) {
		this.id = id;
		this.name = name;
		this.employeeList = employeeList;
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee[] getEmployeeList() {
		if(this.employeeList == null) {
			this.employeeList = new Employee[20];
		}
		return employeeList;
	}
	public void setEmployeeList(Employee[] employeeList) {
		if(this.employeeList == null) {
			this.employeeList = new Employee[employeeList.length];
		}
		for(int i=0; i<employeeList.length; i++) {
			this.employeeList[i] = employeeList[i];
		}
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void addEmployee(Employee employee) {
		for(int i=0; i<this.getEmployeeList().length; i++) {
			if(this.getEmployeeList()[i] == null) {
				employee.setDepartmt(this);
				this.getEmployeeList()[i] = employee;
				this.num = i+1;
				return;
			}
		}
	}
	
	public String printDptInfo() {
		return this.getName() +"共有"+ this.getNum()+"名员工\n";
	}
	
	
}
