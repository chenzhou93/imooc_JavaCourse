package com.imooc.test;

import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int one = 12;
//		int two = 2;
//		System.out.println("one/two" + (one/two));
		
		//接受键盘输入
		Scanner input = new Scanner(System.in);
		System.out.println("======运算开始======");
		try {
			System.out.print("请输入第一个整数: ");
			int one = input.nextInt();
			System.out.print("请输入第一个整数: ");
			int two = input.nextInt();
			System.out.println("one/two = " + (one/two));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("程序出错");
		}
		System.out.println("======运算结束======");

	}

}
