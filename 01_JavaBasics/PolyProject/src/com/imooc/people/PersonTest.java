package com.imooc.people;

public class PersonTest {
	public static void main(String[] args) {
		Person lili = new Person();
		lili.age = 12;
		
		//获取内部类的实例对象
		//方法一：new外部类，new内部类
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());
		
		//方法二：外部类对象.new内部类
		myHeart = lili.new Heart();
		System.out.println(myHeart.beat());
		
		//方法三：外部类对象.获取方法
		myHeart = lili.getHeart();
		System.out.println(myHeart.beat());
	}
}
