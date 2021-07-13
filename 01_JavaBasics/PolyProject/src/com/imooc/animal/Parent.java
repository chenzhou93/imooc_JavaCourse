package com.imooc.animal;

public class Parent {
	//1.编写方法，传入不同类型的动物，调用各自的方法
//	public void feed(Cat cat) {
//		cat.eat();
//		cat.play();
//	}
//	
//	public void feed(Dog dog) {
//		dog.eat();
//		dog.sleep();
//	}
	
	//2.编写方法，传入动物的父类，方法中通过类型转换调用指定子类的方法
	public void feed(Animal obj) {
		if(obj instanceof Cat) {
			Cat temp = (Cat)obj;
			temp.eat();
			temp.play();
		}else if(obj instanceof Dog) {
			Dog temp = (Dog)obj;
			temp.eat();
			temp.sleep();
		}
	}
	
	/*
	 * 空闲时间多：养狗
	 * 空闲时间少：养猫
	 * */
	
	//1
	public Dog hasManyTime() {
		System.out.println("more time, good for dog");
		return new Dog();
	}
	
	public Cat hasLittleTime() {
		System.out.println("less time, good for cat");
		return new Cat();
	}
	
	//2
	public Animal raise(Boolean hasManyTime) {
		if(hasManyTime) {
			System.out.println("has many time, dog");
			return new Dog();
		}else {
			System.out.println("has less time, cat");
			return new Cat();
		}
	}
	
}
