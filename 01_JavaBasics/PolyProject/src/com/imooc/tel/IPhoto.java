package com.imooc.tel;
/*
 * 具有照相能力的接口
 * 
 * 
 * */
public interface IPhoto {
	//
	public void photo();
	
	default void connection() {
		System.out.println("iphoto connection");
	}
}
