package com.imooc.singleton;
//懒汉式：类内实例对象创建时，并不直接初始化，直到第一次调用get方法的时候，才完成初始化的操作
//时间换空间
public class SingletonTwo {
	//1.创建私有构造方法
	private SingletonTwo() {
		
	}
	
	//2.创建静态该类实例对象
	private static SingletonTwo instance = null;
	
	//3.创建开放的静态方法，提供实例对象
	public static SingletonTwo getInstance() {
		if(instance == null) {
			instance = new SingletonTwo();
		}
		return instance;
	}
}
