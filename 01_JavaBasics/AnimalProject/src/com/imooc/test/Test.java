package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat one = new Cat();
		one.setName("Huahua");
		one.setSpecies("CHN");
		one.eat();
		one.run();
		System.out.println(one.temp);
		
		System.out.println("====================");
		
		Dog two = new Dog();
		two.setName("niuniu");
		two.setMonth(1);
		two.eat();
		two.sleep();
		
		two.eat("fanfan");
		
		Animal three = new Animal();
		//three.run(); error

	}

}
