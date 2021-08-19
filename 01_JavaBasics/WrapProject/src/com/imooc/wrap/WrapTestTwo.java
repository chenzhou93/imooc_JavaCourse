package com.imooc.wrap;

public class WrapTestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//基本数据类型转换成字符串
		int t1 = 2;
		String t2 = Integer.toString(t1);
		
		//Test
		System.out.println("t2: " + t2);
		System.out.println("=====================");
		
		//字符串转换为基本数据类型
		//1.包装类的parse
		int t3 = Integer.parseInt(t2);
		System.out.println("t3: " + t3);
		//2.value of
		int t4 = Integer.valueOf(t2);
		System.out.println("t4: " + t4);
	}

}
