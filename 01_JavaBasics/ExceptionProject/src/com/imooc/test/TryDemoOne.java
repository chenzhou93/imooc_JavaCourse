package com.imooc.test;

import java.util.InputMismatchException;
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
		}catch(ArithmeticException e) {
			System.exit(1);
			System.out.println("除数不允许为0");
			e.printStackTrace();
		}catch(InputMismatchException e) {
			System.out.println("请输入整数");
			e.printStackTrace();
		}catch(Exception e) {//捕捉前面异常中无法捕获的信息
			System.out.println("出错");
			e.printStackTrace();
		}finally {
			System.out.println("======运算结束======");
		}

	}

}
