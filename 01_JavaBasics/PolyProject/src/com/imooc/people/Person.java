package com.imooc.people;

public class Person {
	int age;
	
	public Heart getHeart() {
		new Heart().temp = 12;
		return new Heart();
	}
	
	public void eat() {
		System.out.println("people can eat");
	}
	
	/*
	 * 1.在外部使用无需直接实例化，需要借由外部类信息才能完成实例化
	 * 2.访问修饰符可以任意
	 * 3.内部类可以直接访问外部类成员，如果出现同名属性，优先访问内部类中定义的
	 * 4.可以使用外部类.this.成员的方式，访问外部类同名的信息
	 * 5.外部类访问内部类信息，需要通过内部类实例，无法直接访问
	 * 6.内部类编译后.class文件命名：外部类$内部类.class
	 * 7.内部类中是否可以包含与外部类相同方法签名的方法？
	 * */
	public class Heart{
		int age = 23;
		int temp = 22;
//		public String beat() {
//			return " heart beats";
//		}
		public String beat() {
			eat();
			//Person.this.age
			return age + " heart beats";
		}
	}
}
