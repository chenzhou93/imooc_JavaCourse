package com.imooc.operator;

public class MathDemo1 {

	public static void main(String[] args) {
		//x++
		int x = 4;
		int y = (x++) + 5; //9
		System.out.println("x=" + x + ", y=" + y);//5,9
		
		//++x
		x=4;
		y = (++x) + 5;
		System.out.println("x=" + x + ", y=" + y); //5,10
		
		//x--
		x=4;
		y = (x--) + 5;
		System.out.println("x=" + x + ", y=" + y); //3,9
		
		//--x
		x=4;
		y = (--x) + 5;
		System.out.println("x=" + x + ", y=" + y); //3,8
			

	}

}
