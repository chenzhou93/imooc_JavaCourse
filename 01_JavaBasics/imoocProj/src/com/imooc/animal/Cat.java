package com.imooc.animal;

public class Cat {
	//修改属性可见性 --- private
	private String name;
	int month;
	double weight;
	String species;
	
	public static int price;
	
	public Cat(String name, int month, double weight, String species) {
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.species = species;
	}
	
	public Cat(int month) {
		this.setMonth(month);
	}
	
	//设置get set方法
	//在get set方法中添加对属性的限定
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month <= 0) {
			System.out.println("error: age must be greater than 0");
		}else {
			this.month = month;
		}
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public Cat() {
		System.out.println("我是无参构造方法");
	}
	public Cat(String name) {
		System.out.println("我是带参构造方法");
	}
	
	public void run() {
		this.eat();
		System.out.println("小猫快跑");
	}
	public void run(String name) {
		System.out.println(name + "快跑");
	}
	
	public void eat() {
		System.out.println("eat");
	}
	
}
