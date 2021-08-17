package com.imooc.test;

import java.util.Scanner;

public class TryDemoFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			testAge();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/*
	 * throw 抛出异常对象的处理方案
	 * 1.通过try-catch包含throw语句，自己抛出自己处理
	 * 2.通过throws在方法声明处抛出异常类型--谁调用谁处理--调用者可以自己处理，也可以继续向上抛由上层来处理
	 * 		可以抛出与throw相同类型或者其父类
	 * */
	public static void testAge() throws Exception {
		System.out.println("input your age");
		Scanner input = new Scanner(System.in);
		
		int age = input.nextInt();
		if(age < 18 || age > 60) {
			throw new Exception("under 18 or over 60");
		}else {
			System.out.println("welcome");
		}
	}

}
