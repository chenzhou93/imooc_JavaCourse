package com.imooc.wrap;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer one = new Integer(100);
		Integer two = new Integer(100);
		System.out.println(one == two);
		
		Integer three = 100;
		System.out.println(three == 100);
		
		Integer four = 100;
		System.out.println(four == three);
		
		Integer five = 200;
		System.out.println(five == 200);
		
		Integer six = 200;
		System.out.println(five == six);//200 > 128
		
		Double d1 = Double.valueOf(100);
		Double d2 = Double.valueOf(100);
		System.out.println(d1 == d2);//false

	}

}
