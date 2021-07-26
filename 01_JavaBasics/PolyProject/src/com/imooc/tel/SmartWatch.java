package com.imooc.tel;

public class SmartWatch implements INet, IPhoto {
	public static final int TEMP = 30;
	@Override
	public void network() {
		System.out.println("phone can internet");
	}
	
	@Override
	public void photo() {
		System.out.println("smart watch can internet");
	}
	
//	@Override
//	public void connection() {
//		INet.super.connection();//接口中的默认方法
//	}
	
	public void connection() {
		System.out.println("smart watch connection");
	}
}
