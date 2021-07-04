package com.imooc.company;

public class Employee {
	private String name;
	private String id;
	private String gender;
	private int age = 18;
	private Department departmt;
	private Position pos;
	
	
	public Employee() {
	}
	
	public Employee(String name, String id, String gender, int age, Department departmt, Position pos) {
		this.setName(name);
		this.setId(id);
		this.setGender(gender);
		this.setAge(age);
		this.setDepartmt(departmt);
		this.setPos(pos);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if(gender.equals("男") || gender.equals("女")) {
			this.gender = gender;
		}else {
			this.gender = "男";
		}
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <=65 && age>=18) {
			this.age = age;
		}
	}
	public Department getDepartmt() {
		return departmt;
	}
	public void setDepartmt(Department departmt) {
		this.departmt = departmt;
	}
	public Position getPos() {
		return pos;
	}
	public void setPos(Position pos) {
		this.pos = pos;
	}
	
	public String selfIntro() {
		return "姓名：" + this.getName() 
		+ "\n工号：" + this.getId() 
		+ "\n性别：" + this.getGender()
		+ "\n年龄：" + this.getAge()
		+ "\n职务：" + this.getDepartmt().getName() + this.getPos().getName()
		+ "\n===============================================\n";
	}
	
	
	
}
