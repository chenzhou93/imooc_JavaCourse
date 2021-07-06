package com.imooc.animal;

public class Cat extends Animal {
	//independent property: weight
	private double weight;
	
	public Cat() {
		
	}
	
	public Cat(String name, int month, double weight) {
		super(name, month);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	//method: run
	public void run() {
		System.out.println("小猫快乐地奔跑");
	}
	
	//override eat method
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
}
