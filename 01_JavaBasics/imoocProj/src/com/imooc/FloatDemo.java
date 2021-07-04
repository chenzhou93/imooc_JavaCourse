package com.imooc;

public class FloatDemo {

	public static void main(String[] args) {
		//定义一个单精度浮点变量，存放1234.328
		float f = 1234.328f;
		System.out.println("f="+f);
		
		//定义一个双精度浮点变量，存放5632.465
		double d = 5623.465;
		System.out.println("d=" + d);
		//将整型赋值给浮点型
		double d1 = 123L;//double表示数据范围最大
		System.out.println("d1=" + d1);
		
		//变量间的赋值
		double d2 = d;
		System.out.println("d2=" + d2);
	}

}
