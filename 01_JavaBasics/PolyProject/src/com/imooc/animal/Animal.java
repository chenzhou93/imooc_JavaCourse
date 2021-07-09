package com.imooc.animal;

public class Animal {
	//name, age
	private String name;
	private int month;
	
	public Animal() {
		
	}
	
	public Animal(String name, int month) {
		this.name = name;
		this.month = month;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	//eat
	public void eat() {
		System.out.println("动物都有吃东西的能力");
	}
	
	public static void say() {//子类只能继承不能重写
		System.out.println("say");
	}
	
}
