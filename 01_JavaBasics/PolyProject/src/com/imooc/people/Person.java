package com.imooc.people;

public class Person {
	//int age;
	static int age;
	
//	public Heart getHeart() {
//		new Heart().temp = 12;
//		return new Heart();
//	}
	
	public void eat() {
		System.out.println("people can eat");
	}
	
	
	/*
	 * 成员内部类
	 * 1.在外部使用无需直接实例化，需要借由外部类信息才能完成实例化
	 * 2.访问修饰符可以任意
	 * 3.内部类可以直接访问外部类成员，如果出现同名属性，优先访问内部类中定义的
	 * 4.可以使用外部类.this.成员的方式，访问外部类同名的信息
	 * 5.外部类访问内部类信息，需要通过内部类实例，无法直接访问
	 * 6.内部类编译后.class文件命名：外部类$内部类.class
	 * 7.内部类中是否可以包含与外部类相同方法签名的方法？
	 * */
	
	/*
	public class Heart{
		int age = 23;
		int temp = 22;
		public String beat() {
			eat();
			//Person.this.age
			return age + " heart beats";
		}
	}*/
	
	/*
	 * 静态内部类
	 * 1.静态内部类中，只能直接访问外部类的静态成员，如果要调用非静态成员，可以通过对象实例
	 * 2.静态内部类对象实例时，可以不依赖于外部类对象
	 * 3.可以通过外部类.内部类.静态成员的方式，访问内部类中的静态成员
	 * 4.当内部类属性与外部类属性同名时，默认直接调用内部类中的成员；
	 * 		如果需要访问外部类中的静态属性，可以通过 外部类.属性 的方式；
	 * 		如果需要访问外部类中的非静态属性，通过 new 外部类().属性
	 * */
	
	/*
	public static class Heart{
		int age = 23;
		int temp = 22;
		public static void say() {
			System.out.println("hello");
		}
		public String beat() {
			new Person().eat();
			//Person.this.age
			return new Person().age + " heart beats";
		}
	}*/
	
	/*
	 * 方法内部类
	 * 1.定义在方法内部，作用范围也在方法内
	 * 2.和方法内部成员使用规则一样，class前不可添加 public, private, protected, static
	 * 3.类中不能包含静态成员
	 * 4.可以包含 final，abstract 成员
	 * */
	public String getHeart() {
		class Heart{
			public int age = 23;
			int temp = 22;
			public void say() {
				System.out.println("hello");
			}
			public String beat() {
				new Person().eat();
				//Person.this.age
				return new Person().age + " heart beats";
			}
		}
		return new Heart().beat();
	}
	
	
	
}
