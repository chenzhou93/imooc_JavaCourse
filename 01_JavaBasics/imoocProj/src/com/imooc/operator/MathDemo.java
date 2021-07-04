package com.imooc.operator;

public class MathDemo {

	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		int result;
		result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		
		//字符串链接
		System.out.println("" + num1 + num2);
		
		//减法
		result = num1-num2;
		System.out.println(num1+"-"+num2+"="+result);
		
		//乘法
		result = num1*num2;
		System.out.println(num1+"*"+num2+"="+result);
		
		//除法
		result = num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		
		System.out.println(13/5);
		System.out.println(13.0/5.0);
		
		//求余数
		result = 13%num2;
		System.out.println("13%"+num2+"="+result);
		System.out.println("13.5%5=" + 13.5%5);

	}

}
