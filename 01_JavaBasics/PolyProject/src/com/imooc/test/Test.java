package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 向上转型、隐式转型、自动转型
		 * 父类引用指向子类实例
		 * 可以调用子类重写父类的方法，以及父类派生的方法
		 * 父类中的静态方法无法被子类重写，向上转型之后，只能调用父类原有的静态方法
		 * 无法调用子类特有的方法
		 */
		//Animal one = new Animal(); //1
		Animal two = new Cat();//2
		Animal three = new Dog();//3
		
		//one.eat();
		two.eat();
		three.eat();
		
		two.say();
		
		Cat cat=(Cat)two;
		cat.say();
		
		System.out.println("====================");
		
		/*
		 * 向下转型，强制类型转换
		 * 子类引用指向父类对象，此处要求必须进行强制类型转换
		 * 可以调用子类特有的方法
		 * 必须满足转型条件才可以转换
		 * instanceof 运算符
		*/
		
		Cat temp = (Cat)two; //Animal two = new Cat();
		temp.eat();
		temp.run();
		temp.getMonth();
		
		//Dog temp2 = (Dog)two;//error
//		temp2.eat();
//		temp2.sleep();
//		temp2.getSex();
		
		if(two instanceof Cat) {
			Cat tmp = (Cat) two;
			tmp.eat();
			tmp.run();
			tmp.getMonth();
			System.out.println("two -> cat");
		}
		
		if(two instanceof Dog) {
			Dog tmp2 = (Dog) two;
			tmp2.eat();
			tmp2.sleep();
			tmp2.getSex();
			System.out.println("two -> dog");
		}
		
		if(two instanceof Animal) {
			System.out.println("two -> Animal");
		}
		
		if(two instanceof Object) {
			System.out.println("two -> Object");
		}
		
		

	}

}
