package com.imooc.animal;

public class Dog extends Animal {
	private String sex;
	public Dog() {
		
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//Sleep
	public void sleep() {
		super.eat();
		super.species = "dog";
		System.out.println(this.getName() + "现在" + this.getMonth() + "个月大，在睡觉");
	}
	
	/*
	 * 方法重载
	 * */
//	private String sleep(String name) {
//		return "";
//	}
//	
//	private void sleep(String name, int month) {
//		
//	}
	public void eat() {
		System.out.println(this.getName() + " EAT");
	}
	
	public void eat(String month) {
		System.out.println(month + " EAT");
	}
	
	
}
