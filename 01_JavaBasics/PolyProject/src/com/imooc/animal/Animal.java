package com.imooc.animal;

//抽象类不允许实例化，可以通过向上转型，指向子类实例
//抽象类可以没有抽象方法，抽象方法必须在抽象类中
public abstract class Animal {
//public class Animal {
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
	
	//抽象方法：不允许包含方法体，子类中需要重写父类的抽象方法，否则子类也是抽象类
	//static final private 不能与abstract并存
	public abstract void eat();
//	{
//		//System.out.println("动物都有吃东西的能力");
//	}
	
	public static void say() {//子类只能继承不能重写
		System.out.println("say");
	}
	
}
