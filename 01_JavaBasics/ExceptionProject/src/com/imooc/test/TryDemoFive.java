package com.imooc.test;

public class TryDemoFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			testThree();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void testOne() throws HotelAgeException {
		throw new HotelAgeException();
	}
	public static void testTwo() throws Exception {
		try {
			testOne();
		}catch(HotelAgeException e) {
			throw new Exception("I'm new exception e 1");
		}
	}
	public static void testThree() throws Exception {
		try {
			testTwo();
		}catch(Exception e) {
			Exception e1 = new Exception("I'm new exception e 2");
			e1.initCause(e);
			throw e1;
		}
	}


}
