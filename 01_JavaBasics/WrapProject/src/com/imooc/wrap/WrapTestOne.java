package com.imooc.wrap;

public class WrapTestOne {
	public static void main(String[] args) {
		//装箱:把基本数据类型转换成包装类
		//1.自动装箱
		int t1 = 2;
		Integer t2 = t1;
		//2.手动装箱
		Integer t3 = new Integer(t1);//deprecated after JDK 1.9
		
		//Test
		System.out.println("int type t1: " + t1);
		System.out.println("Integer type t2: " + t2);
		System.out.println("Integer type t3: " + t3);
		System.out.println(" ============================= ");
		
		//拆箱
		//1.自动拆箱
		int t4 = t2;
		System.out.println("t2: " + t2);
		System.out.println("t4: " + t4);
		
		//2.手动拆箱
		int t5 = t2.intValue();
		System.out.println("t2: " + t2);
		System.out.println("t5: " + t5);
		double t6 = t2.doubleValue();
		System.out.println("t6: " + t6);
	}
}
