package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal one = new Animal(); //1
		
		/*
		 * 向上转型、隐式转型、自动转型
		 * 父类引用指向子类实例
		 * 可以调用子类重写父类的方法，以及父类派生的方法
		 * 无法调用子类特有的方法
		*/
		Animal two = new Cat();//2
		Animal three = new Dog();//3
		
		one.eat();
		two.eat();
		three.eat();

	}

}
