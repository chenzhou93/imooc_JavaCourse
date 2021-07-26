package com.imooc.tel;

public interface INet {
	//接口中抽象方法可以不写abstract关键字
	//访问修饰符默认public
	//当类实现接口时，需要去实现接口中的所有抽象方法，否则需要将该类设置为抽象类
	void network();
	
	//接口中包含常量，默认public static final
	int TEMP = 20;
	
	//default:默认方法，可以带方法体
	default void connection() {
		System.out.println("I'm default connection of interface");
	}
	
	//static:静态方法 可以带方法体
	//不可以在实现类中重写，可以通过接口名调用
	static void stop() {
		System.out.println("I'm static method of interface");
	}
}
