package com.imooc.generic;

public class GenericMethod {
	public <T> void printValue(T t) {
		System.out.println(t);
	}
	
	//public <T extends Number> void printValue(T t)
	
	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		gm.printValue("Hello");
		gm.printValue(123);
		gm.printValue(5.0f);
	}
}
