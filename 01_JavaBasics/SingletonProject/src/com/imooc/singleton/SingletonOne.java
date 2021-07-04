package com.imooc.singleton;
//饿汉式:创建对象实例的时候直接初始化

public class SingletonOne {
	//1.private construct
	private SingletonOne() {
		
	}
	
	//2.Create private static instance
	private static SingletonOne instance = new SingletonOne();
	
	//3.Create public static method, return static instance
	public static SingletonOne getInstance() {
		return instance;
	}
}
